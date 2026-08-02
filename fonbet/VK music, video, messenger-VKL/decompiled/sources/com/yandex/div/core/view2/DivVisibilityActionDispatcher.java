package com.yandex.div.core.view2;

import android.view.View;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivVisibilityChangeListener;
import com.yandex.div.core.view2.divs.DivActionBeaconSender;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.a;
import com.yandex.div2.v3;
import com.yandex.div2.zd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import xsna.apn;
import xsna.gzs;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivVisibilityActionDispatcher.kt */
/* loaded from: classes7.dex */
public class DivVisibilityActionDispatcher {
    private static final Companion Companion = new Companion(null);
    private final Map<CompositeLogId, Integer> appearLogCounters = CollectionsKt.arrayMap();
    private final Map<CompositeLogId, Integer> disappearLogCounters = CollectionsKt.arrayMap();
    private final DivActionBeaconSender divActionBeaconSender;
    private final DivActionHandler divActionHandler;
    private final Div2Logger logger;
    private final List<DivVisibilityChangeListener> visibilityListeners;

    /* compiled from: DivVisibilityActionDispatcher.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivVisibilityActionDispatcher(Div2Logger div2Logger, List<? extends DivVisibilityChangeListener> list, DivActionHandler divActionHandler, DivActionBeaconSender divActionBeaconSender) {
        this.logger = div2Logger;
        this.visibilityListeners = list;
        this.divActionHandler = divActionHandler;
        this.divActionBeaconSender = divActionBeaconSender;
    }

    private Map<CompositeLogId, Integer> countersFor(apn apnVar) {
        return apnVar instanceof zd ? this.appearLogCounters : this.disappearLogCounters;
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, apn apnVar) {
        if (apnVar instanceof zd) {
            this.logger.logViewShown(div2View, expressionResolver, view, (zd) apnVar);
        } else {
            this.logger.logViewDisappeared(div2View, expressionResolver, view, (v3) apnVar);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(apnVar, expressionResolver);
    }

    public void dispatchAction(Div2View div2View, ExpressionResolver expressionResolver, View view, apn apnVar) {
        CompositeLogId compositeLogIdOf = CompositeLogIdKt.compositeLogIdOf(div2View, apnVar.a().evaluate(expressionResolver));
        Map<CompositeLogId, Integer> countersFor = countersFor(apnVar);
        Integer num = countersFor.get(compositeLogIdOf);
        if (num == null) {
            num = 0;
            countersFor.put(compositeLogIdOf, num);
        }
        int intValue = num.intValue();
        KLog kLog = KLog.INSTANCE;
        Severity severity = Severity.INFO;
        if (kLog.isAtLeast(severity)) {
            kLog.print(4, "DivVisibilityActionDispatcher", "visibility action dispatched: id=" + compositeLogIdOf + ", counter=" + intValue);
        }
        long longValue = apnVar.b().evaluate(expressionResolver).longValue();
        if (longValue == 0 || intValue < longValue) {
            if (this.divActionHandler.getUseActionUid()) {
                String uuid = UUID.randomUUID().toString();
                DivActionHandler actionHandler = div2View.getActionHandler();
                if (!(actionHandler != null ? actionHandler.handleAction(apnVar, div2View, expressionResolver, uuid) : false) && !this.divActionHandler.handleAction(apnVar, div2View, expressionResolver, uuid)) {
                    logAction(div2View, expressionResolver, view, apnVar, uuid);
                }
            } else {
                DivActionHandler actionHandler2 = div2View.getActionHandler();
                if (!(actionHandler2 != null ? actionHandler2.handleAction(apnVar, div2View, expressionResolver) : false) && !this.divActionHandler.handleAction(apnVar, div2View, expressionResolver)) {
                    logAction(div2View, expressionResolver, view, apnVar);
                }
            }
            countersFor(apnVar).put(compositeLogIdOf, Integer.valueOf(intValue + 1));
            if (kLog.isAtLeast(severity)) {
                kLog.print(4, "DivVisibilityActionDispatcher", "visibility action logged: " + compositeLogIdOf);
            }
        }
    }

    public void dispatchActions(final Div2View div2View, final ExpressionResolver expressionResolver, final View view, final apn[] apnVarArr) {
        div2View.bulkActions$div_release(new gzs<s3q0>() { // from class: com.yandex.div.core.view2.DivVisibilityActionDispatcher$dispatchActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // xsna.gzs
            public /* bridge */ /* synthetic */ s3q0 invoke() {
                invoke2();
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                apn[] apnVarArr2 = apnVarArr;
                DivVisibilityActionDispatcher divVisibilityActionDispatcher = this;
                Div2View div2View2 = div2View;
                ExpressionResolver expressionResolver2 = expressionResolver;
                View view2 = view;
                for (apn apnVar : apnVarArr2) {
                    divVisibilityActionDispatcher.dispatchAction(div2View2, expressionResolver2, view2, apnVar);
                }
            }
        });
    }

    public void dispatchVisibleViewsChanged(Map<View, ? extends a> map) {
        Iterator<T> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            ((DivVisibilityChangeListener) it.next()).onViewsVisibilityChanged(map);
        }
    }

    private void logAction(Div2View div2View, ExpressionResolver expressionResolver, View view, apn apnVar, String str) {
        if (apnVar instanceof zd) {
            this.logger.logViewShown(div2View, expressionResolver, view, (zd) apnVar, str);
        } else {
            this.logger.logViewDisappeared(div2View, expressionResolver, view, (v3) apnVar, str);
        }
        this.divActionBeaconSender.sendVisibilityActionBeacon(apnVar, expressionResolver);
    }
}
