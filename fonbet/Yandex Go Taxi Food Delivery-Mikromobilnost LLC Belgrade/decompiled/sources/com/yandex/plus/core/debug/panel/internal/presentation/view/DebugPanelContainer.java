package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.plus.core.debug.panel.internal.presentation.viewModel.b;
import defpackage.axs;
import defpackage.bb1;
import defpackage.bwg;
import defpackage.cxs;
import defpackage.dej;
import defpackage.dwg;
import defpackage.elz;
import defpackage.evu0;
import defpackage.ewg;
import defpackage.f89;
import defpackage.g8e;
import defpackage.hxq;
import defpackage.i3y;
import defpackage.ike;
import defpackage.izj;
import defpackage.jhd;
import defpackage.jzj;
import defpackage.kez;
import defpackage.lx60;
import defpackage.me0;
import defpackage.o400;
import defpackage.qx60;
import defpackage.rx60;
import defpackage.sb0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tcc;
import defpackage.tls;
import defpackage.tvg;
import defpackage.u1w;
import defpackage.upg0;
import defpackage.uyh0;
import defpackage.uyj;
import defpackage.wau;
import defpackage.wkz;
import defpackage.wls;
import defpackage.wwg;
import defpackage.ybf;
import defpackage.ykf;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0014¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000bH\u0014¢\u0006\u0004\b#\u0010\"Jm\u0010,\u001a\u00020\u000b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u001d2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0&2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u001d\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\"J\u0015\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u001b¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0015\u00107\u001a\u00020\u000b2\u0006\u0010/\u001a\u000206¢\u0006\u0004\b7\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010:R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010;R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010<R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010<R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00150=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelContainer;", "Landroid/widget/FrameLayout;", "Ldej;", "Landroid/content/Context;", "context", "Lu1w;", "insets", "Ltvg;", "logsFileManager", "Lkotlin/Function1;", "", "Lzy11;", "onAdditionalDataClicked", "Lkotlin/Function0;", "onLogsClicked", "onClearLogsClicked", "onCloseButtonClicked", "", "onBackButtonClicked", "<init>", "(Landroid/content/Context;Lu1w;Ltvg;Ltls;Lsls;Lsls;Lsls;Ltls;)V", "Landroid/view/View;", "view", "addScreen", "(Landroid/view/View;)V", "goBack", "()Z", "Ldwg;", "uiState", "", "Lbwg;", "getInfoList", "(Ldwg;)Ljava/util/List;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lhxq;", "items", "Lkotlin/Function2;", "", "onCheckboxClicked", "onConfirm", "onReset", "onDismiss", "showDialog", "(Ljava/util/List;Lwls;Ltls;Lsls;Lsls;)V", "dismissDialog", ClidProvider.STATE, "showInfo", "(Ldwg;)V", "Lykf;", MetaDataField.SCREEN_FIELD, "showCustomScreen", "(Lykf;)V", "Lewg;", "showLogs", "(Lewg;)V", "Lu1w;", "Ltvg;", "Ltls;", "Lsls;", "Ljava/util/Stack;", "viewStack", "Ljava/util/Stack;", "Llx60;", "backCallback", "Llx60;", "Lwkz;", "logsFilter", "Lwkz;", "Lkez;", "logsFormatter", "Lkez;", "Lelz;", "logsMapper", "Lelz;", "Laxs;", "infoFormatter", "Laxs;", "Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelGeneralInfoView;", "infoView$delegate", "Li3y;", "getInfoView", "()Lcom/yandex/plus/core/debug/panel/internal/presentation/view/DebugPanelGeneralInfoView;", "infoView", "homeless-core-debug-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugPanelContainer extends FrameLayout implements dej {
    private final lx60 backCallback;
    private final axs infoFormatter;

    /* renamed from: infoView$delegate, reason: from kotlin metadata */
    private final i3y infoView;
    private final u1w insets;
    private final tvg logsFileManager;
    private final wkz logsFilter;
    private final kez logsFormatter;
    private final elz logsMapper;
    private final tls onAdditionalDataClicked;
    private final tls onBackButtonClicked;
    private final sls onClearLogsClicked;
    private final sls onCloseButtonClicked;
    private final sls onLogsClicked;
    private final Stack<View> viewStack;

    public DebugPanelContainer(Context context, u1w u1wVar, tvg tvgVar, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, tls tlsVar2) {
        super(context);
        this.insets = u1wVar;
        this.logsFileManager = tvgVar;
        this.onAdditionalDataClicked = tlsVar;
        this.onLogsClicked = slsVar;
        this.onClearLogsClicked = slsVar2;
        this.onCloseButtonClicked = slsVar3;
        this.onBackButtonClicked = tlsVar2;
        this.viewStack = new Stack<>();
        this.backCallback = new lx60(new ybf(15, this));
        this.logsFilter = new wkz();
        this.logsFormatter = new kez(new me0(context, 5));
        this.logsMapper = new elz();
        this.infoFormatter = new axs();
        this.infoView = kotlin.a.a(new jhd(23, context, this));
        setBackgroundColor(bb1.n(upg0.home_sdk_semantic_bg_primary_page, this));
        setClickable(true);
        setFocusable(true);
    }

    private final void addScreen(View view) {
        this.viewStack.push(view);
        addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 backCallback$lambda$0(DebugPanelContainer debugPanelContainer) {
        if (debugPanelContainer.viewStack.peek() instanceof CustomDialogView) {
            debugPanelContainer.dismissDialog();
        } else {
            debugPanelContainer.onBackButtonClicked.invoke(Boolean.valueOf(debugPanelContainer.goBack()));
        }
        return zy11.a;
    }

    private final List<bwg> getInfoList(dwg uiState) {
        ArrayList arrayList = new ArrayList();
        String t = bb1.t(uyh0.plus_sdk_debug_panel_general_information_title, this);
        arrayList.add(new wau(t, t));
        axs axsVar = this.infoFormatter;
        List list = uiState.a;
        List list2 = uiState.b;
        axsVar.getClass();
        List<cxs> list3 = list;
        ArrayList arrayList2 = new ArrayList(tcc.n(list3, 10));
        for (cxs cxsVar : list3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String str = cxsVar.b;
            int G = evu0.G(str, '\n', 0, 6);
            Integer valueOf = Integer.valueOf(G);
            if (G == -1) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : str.length();
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str.substring(0, intValue));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) str.substring(intValue));
            arrayList2.add(new izj(cxsVar.a, new SpannedString(spannableStringBuilder)));
        }
        arrayList.addAll(arrayList2);
        String t2 = bb1.t(uyh0.plus_sdk_debug_panel_logs_screen_title, this);
        arrayList.add(new wau(t2, t2));
        String t3 = bb1.t(uyh0.plus_sdk_debug_panel_general_screen_logs_item_title, this);
        arrayList.add(new jzj(t3, new SpannedString(t3)));
        List list4 = list2;
        if (!list4.isEmpty()) {
            String t4 = bb1.t(uyh0.plus_sdk_debug_panel_specified_information_title, this);
            arrayList.add(new wau(t4, t4));
            arrayList.addAll(list4);
        }
        return arrayList;
    }

    private final DebugPanelGeneralInfoView getInfoView() {
        return (DebugPanelGeneralInfoView) this.infoView.getValue();
    }

    private final boolean goBack() {
        if (this.viewStack.size() <= 1) {
            return false;
        }
        removeAllViews();
        addView(this.viewStack.pop());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DebugPanelGeneralInfoView infoView_delegate$lambda$1(Context context, DebugPanelContainer debugPanelContainer) {
        return new DebugPanelGeneralInfoView(context, debugPanelContainer.insets, debugPanelContainer.onAdditionalDataClicked, debugPanelContainer.onLogsClicked, debugPanelContainer.onCloseButtonClicked);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$2(tls tlsVar, sls slsVar, DebugPanelContainer debugPanelContainer, List list) {
        tlsVar.invoke(list);
        slsVar.invoke();
        debugPanelContainer.dismissDialog();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$3(sls slsVar, sls slsVar2, DebugPanelContainer debugPanelContainer) {
        slsVar.invoke();
        slsVar2.invoke();
        debugPanelContainer.dismissDialog();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showDialog$lambda$4(sls slsVar, DebugPanelContainer debugPanelContainer) {
        slsVar.invoke();
        debugPanelContainer.dismissDialog();
        return zy11.a;
    }

    public void dismissDialog() {
        View peek = this.viewStack.peek();
        if ((peek instanceof CustomDialogView ? (CustomDialogView) peek : null) != null) {
            removeView(this.viewStack.pop());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        qx60 onBackPressedDispatcher;
        super.onAttachedToWindow();
        rx60 r = wwg.r(this);
        if (r == null || (onBackPressedDispatcher = r.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.b(this.backCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.backCallback.g();
    }

    public final void showCustomScreen(ykf screen) {
        getContext();
        throw null;
    }

    @Override // defpackage.dej
    public void showDialog(List<hxq> items, wls onCheckboxClicked, tls onConfirm, sls onReset, sls onDismiss) {
        dismissDialog();
        addScreen(new CustomDialogView(getContext(), onCheckboxClicked, items, new f89(16, onConfirm, onDismiss, this), new sb0(onReset, onDismiss, this, 25), new jhd(22, onDismiss, this)));
    }

    public final void showInfo(dwg state) {
        if (this.viewStack.size() > 1) {
            this.viewStack.pop();
        }
        if (this.viewStack.isEmpty()) {
            this.viewStack.push(getInfoView());
        }
        removeAllViews();
        addView(getInfoView());
        getInfoView().updateInfo(getInfoList(state));
    }

    public final void showLogs(ewg state) {
        sjh sjhVar = uyj.a;
        ike f = g8e.f(o400.a);
        addScreen(new DebugPanelLogsView(getContext(), this, f, new b(state, f, this.logsFormatter, this.logsFilter, this.logsMapper, this.logsFileManager, this.onClearLogsClicked), this.insets, this.onBackButtonClicked));
    }
}
