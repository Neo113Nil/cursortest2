package com.yandex.go.taxi.order.communications;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.go.taxi.order.communications.analytics.PromoPlaqueAnalytics$Screen;
import defpackage.hbp0;
import defpackage.ipf0;
import defpackage.kpf0;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.ypf0;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes14.dex */
public final class l extends f {
    public static final /* synthetic */ int i0 = 0;
    public final ListItemComponent c0;
    public final o2y0 d0;
    public final PromoPlaqueAnalytics$Screen e0;
    public final ipf0 f0;
    public final ru.yandex.taxi.widget.c g0;
    public pzt0 h0;

    public l(ru.yandex.taxi.utils.d dVar, ytz ytzVar, ypf0 ypf0Var, ListItemComponent listItemComponent, o2y0 o2y0Var, PromoPlaqueAnalytics$Screen promoPlaqueAnalytics$Screen, ipf0 ipf0Var, ru.yandex.taxi.widget.c cVar) {
        super(listItemComponent, dVar, ytzVar, ypf0Var);
        this.c0 = listItemComponent;
        this.d0 = o2y0Var;
        this.e0 = promoPlaqueAnalytics$Screen;
        this.f0 = ipf0Var;
        this.g0 = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d0(l lVar, ListItemComponent listItemComponent, kpf0 kpf0Var, ContinuationImpl continuationImpl) {
        TrailTextViewHolder$bindTrail$1 trailTextViewHolder$bindTrail$1;
        int i;
        CharSequence charSequence;
        View trailViewAs;
        lVar.getClass();
        if (continuationImpl instanceof TrailTextViewHolder$bindTrail$1) {
            trailTextViewHolder$bindTrail$1 = (TrailTextViewHolder$bindTrail$1) continuationImpl;
            int i2 = trailTextViewHolder$bindTrail$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trailTextViewHolder$bindTrail$1.label = i2 - Integer.MIN_VALUE;
                TrailTextViewHolder$bindTrail$1 trailTextViewHolder$bindTrail$12 = trailTextViewHolder$bindTrail$1;
                Object obj = trailTextViewHolder$bindTrail$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trailTextViewHolder$bindTrail$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    CommunicationItem.a aVar = kpf0Var.a.g;
                    FormattedText formattedText = aVar != null ? aVar.h : null;
                    if (formattedText == null) {
                        charSequence = "";
                        trailViewAs = listItemComponent.getTrailViewAs(TextView.class);
                        if (trailViewAs == null) {
                            ListItemComponent listItemComponent2 = lVar.c0;
                            trailViewAs = new TextView(listItemComponent2.getContext());
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                            marginLayoutParams.rightMargin = tje.r(mrg0.go_design_m_space, listItemComponent2.getContext());
                            trailViewAs.setLayoutParams(marginLayoutParams);
                            listItemComponent.setTrailView(trailViewAs);
                        }
                        ((TextView) trailViewAs).setText(charSequence);
                        return zy11.a;
                    }
                    ru.yandex.taxi.widget.c cVar = lVar.g0;
                    trailTextViewHolder$bindTrail$12.L$0 = listItemComponent;
                    trailTextViewHolder$bindTrail$12.L$1 = null;
                    trailTextViewHolder$bindTrail$12.L$2 = null;
                    trailTextViewHolder$bindTrail$12.label = 1;
                    obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, trailTextViewHolder$bindTrail$12, 30);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    listItemComponent = (ListItemComponent) trailTextViewHolder$bindTrail$12.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                trailViewAs = listItemComponent.getTrailViewAs(TextView.class);
                if (trailViewAs == null) {
                }
                ((TextView) trailViewAs).setText(charSequence);
                return zy11.a;
            }
        }
        trailTextViewHolder$bindTrail$1 = new TrailTextViewHolder$bindTrail$1(lVar, continuationImpl);
        TrailTextViewHolder$bindTrail$1 trailTextViewHolder$bindTrail$122 = trailTextViewHolder$bindTrail$1;
        Object obj2 = trailTextViewHolder$bindTrail$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trailTextViewHolder$bindTrail$122.label;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        trailViewAs = listItemComponent.getTrailViewAs(TextView.class);
        if (trailViewAs == null) {
        }
        ((TextView) trailViewAs).setText(charSequence);
        return zy11.a;
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void X(kpf0 kpf0Var) {
        super.X(kpf0Var);
        pzt0 pzt0Var = this.h0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.h0 = tje.N(this.S.c(), null, null, new TrailTextViewHolder$bind$1(this, kpf0Var, null), 3);
    }

    @Override // com.yandex.go.taxi.order.communications.f
    public final void a0(CommunicationItem communicationItem) {
        hbp0.e(this.S, null, null, new TrailTextViewHolder$reportPromoPlaqueShown$1(this, communicationItem, null), 3);
    }
}
