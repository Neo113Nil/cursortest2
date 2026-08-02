package com.yandex.go.trusted_contacts.share_settings;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.trusted_contacts.data.entities.network.EditContactNameConfigDto;
import com.yandex.go.trusted_contacts.share_settings.ShareSettingsModalView;
import com.yandex.go.trusted_contacts.ui.BaseTrustedContactsModalView;
import defpackage.ce0;
import defpackage.cma1;
import defpackage.dlr0;
import defpackage.ej1;
import defpackage.eln;
import defpackage.g0c;
import defpackage.glh0;
import defpackage.glr0;
import defpackage.he7;
import defpackage.hlq0;
import defpackage.ilr0;
import defpackage.jl40;
import defpackage.k5r0;
import defpackage.mj1;
import defpackage.mt6;
import defpackage.nlr0;
import defpackage.ny61;
import defpackage.o7r0;
import defpackage.olr0;
import defpackage.pgk0;
import defpackage.qkr0;
import defpackage.qoi0;
import defpackage.rkr0;
import defpackage.scc;
import defpackage.skr0;
import defpackage.slr0;
import defpackage.tkr0;
import defpackage.tlr0;
import defpackage.tls;
import defpackage.uj70;
import defpackage.ukr0;
import defpackage.ulr0;
import defpackage.uwl0;
import defpackage.vlr0;
import defpackage.vp4;
import defpackage.w511;
import defpackage.w8h0;
import defpackage.wkr0;
import defpackage.wlr0;
import defpackage.wls;
import defpackage.xlr0;
import defpackage.xng0;
import defpackage.ylr0;
import defpackage.zxs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.taxi.widget.progress.CircularProgressBar;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/yandex/go/trusted_contacts/share_settings/ShareSettingsModalView;", "Lcom/yandex/go/trusted_contacts/ui/BaseTrustedContactsModalView;", "Lylr0;", "Lilr0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/trusted_contacts/share_settings/a;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/trusted_contacts/share_settings/a;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lylr0;", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lxlr0;", "uiState", "render", "(Lxlr0;)V", "Lcom/yandex/go/trusted_contacts/share_settings/a;", "Lwkr0;", "adapter", "Lwkr0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShareSettingsModalView extends BaseTrustedContactsModalView<ylr0> implements ilr0 {
    private wkr0 adapter;
    private final a presenter;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.trusted_contacts.share_settings.ShareSettingsModalView$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            String str = (String) obj;
            a aVar = (a) this.receiver;
            o7r0 o7r0Var = (o7r0) aVar.C.c;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("option_id", str);
            o7r0Var.a.a("TrustedContacts.Editing.OptionSelected", hashMap, 1, new HashMap());
            r0 r0Var = aVar.J;
            skr0 skr0Var = (skr0) r0Var.getValue();
            List list = skr0Var.b;
            skr0Var.getClass();
            r0Var.m(null, new skr0(str, list));
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.trusted_contacts.share_settings.ShareSettingsModalView$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            Boolean bool = (Boolean) obj2;
            boolean booleanValue = bool.booleanValue();
            a aVar = (a) this.receiver;
            o7r0 o7r0Var = (o7r0) aVar.C.c;
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("switch_id", str);
            hashMap.put("is_on", bool);
            o7r0Var.a.a("TrustedContacts.Edit.SwitchTapped", hashMap, 1, new HashMap());
            r0 r0Var = aVar.J;
            List list = ((skr0) r0Var.getValue()).b;
            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
            if (booleanValue) {
                arrayList.add(str);
            } else {
                arrayList.remove(str);
            }
            skr0 skr0Var = (skr0) r0Var.getValue();
            String str2 = skr0Var.a;
            skr0Var.getClass();
            r0Var.m(null, new skr0(str2, arrayList));
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.trusted_contacts.share_settings.ShareSettingsModalView$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            a aVar = (a) this.receiver;
            pgk0 pgk0Var = aVar.D;
            olr0 olr0Var = new olr0(aVar, 0);
            glr0 glr0Var = (glr0) pgk0Var.b;
            glr0Var.A((ej1) glr0Var.N, new eln((String) obj, (EditContactNameConfigDto) obj2), new dlr0(olr0Var));
            return zy11.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareSettingsModalView(Context context, a aVar) {
        super(context);
        this.presenter = aVar;
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, aVar, a.class, "onShareSettingOptionSelectionChanged", "onShareSettingOptionSelectionChanged(Ljava/lang/String;)V", 0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(2, aVar, a.class, "onShareSettingsSwitcherStateChanged", "onShareSettingsSwitcherStateChanged(Ljava/lang/String;Z)V", 0);
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(2, aVar, a.class, "onEditContactNameClicked", "onEditContactNameClicked(Ljava/lang/String;Lcom/yandex/go/trusted_contacts/data/entities/network/EditContactNameConfigDto;)V", 0);
        int i = vp4.W;
        g0c a = qoi0.a(tkr0.class);
        final int i2 = 0;
        ukr0 ukr0Var = new ukr0(0);
        mj1 mj1Var = new mj1(anonymousClass3, 8);
        Class a2 = a.a();
        final int i3 = 1;
        he7 he7Var = new he7(1, mj1Var);
        EmptyList emptyList = EmptyList.a;
        zxs zxsVar = new zxs(a2, 0, ukr0Var, emptyList, he7Var, null);
        int i4 = k5r0.V;
        g0c a3 = qoi0.a(ulr0.class);
        zxs zxsVar2 = new zxs(a3.a(), 0, new ukr0(5), emptyList, new he7(1, new ukr0(6)), null);
        int i5 = uj70.V;
        g0c a4 = qoi0.a(slr0.class);
        zxs zxsVar3 = new zxs(a4.a(), 0, new ukr0(2), emptyList, new he7(1, new ukr0(3)), null);
        int i6 = mt6.Z;
        g0c a5 = qoi0.a(nlr0.class);
        zxs zxsVar4 = new zxs(a5.a(), 0, new ukr0(1), emptyList, new he7(1, new uwl0(11, anonymousClass1)), null);
        int i7 = mt6.Z;
        g0c a6 = qoi0.a(tlr0.class);
        zxs zxsVar5 = new zxs(a6.a(), 0, new ukr0(4), emptyList, new he7(1, new mj1(anonymousClass2, 9)), null);
        int i8 = rkr0.S;
        g0c a7 = qoi0.a(qkr0.class);
        this.adapter = new wkr0(scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, new zxs(a7.a(), 0, new hlq0(28), emptyList, new he7(1, new hlq0(29)), null)));
        RecyclerView recyclerView = ((ylr0) getBinding()).b;
        recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        recyclerView.setAdapter(this.adapter);
        recyclerView.setItemAnimator(null);
        ((ylr0) getBinding()).e.setBackgroundAttr(xng0.bgMain);
        ((ylr0) getBinding()).c.setDebounceClickListener(new Runnable(this) { // from class: blr0
            public final /* synthetic */ ShareSettingsModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i9 = i2;
                ShareSettingsModalView shareSettingsModalView = this.b;
                switch (i9) {
                    case 0:
                        ShareSettingsModalView._init_$lambda$1(shareSettingsModalView);
                        break;
                    default:
                        shareSettingsModalView.onBackPressed();
                        break;
                }
            }
        });
        ((ylr0) getBinding()).e.setOnNavigationClickListener(new Runnable(this) { // from class: blr0
            public final /* synthetic */ ShareSettingsModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i9 = i3;
                ShareSettingsModalView shareSettingsModalView = this.b;
                switch (i9) {
                    case 0:
                        ShareSettingsModalView._init_$lambda$1(shareSettingsModalView);
                        break;
                    default:
                        shareSettingsModalView.onBackPressed();
                        break;
                }
            }
        });
        setDismissOnTouchOutside(false);
        post(new ce0(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ShareSettingsModalView shareSettingsModalView) {
        shareSettingsModalView.presenter.Lg();
    }

    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public ylr0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = LayoutInflater.from(getContext()).inflate(glh0.share_settings_view, parent, false);
        int i = w8h0.list;
        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
        if (recyclerView != null) {
            i = w8h0.save_and_close_btn;
            ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
            if (buttonComponent != null) {
                i = w8h0.share_settings_content;
                LinearLayout linearLayout = (LinearLayout) cma1.O(i, inflate);
                if (linearLayout != null) {
                    i = w8h0.toolbar_modal_view_toolbar;
                    ToolbarComponent toolbarComponent = (ToolbarComponent) cma1.O(i, inflate);
                    if (toolbarComponent != null) {
                        i = w8h0.trusted_contacts_divider;
                        if (((FrameLayout) cma1.O(i, inflate)) != null) {
                            i = w8h0.trusted_contacts_loading;
                            CircularProgressBar circularProgressBar = (CircularProgressBar) cma1.O(i, inflate);
                            if (circularProgressBar != null) {
                                return new ylr0((FrameLayout) inflate, recyclerView, buttonComponent, linearLayout, toolbarComponent, circularProgressBar);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.presenter;
        aVar.Bg(this);
        o7r0 o7r0Var = (o7r0) aVar.C.c;
        o7r0Var.getClass();
        o7r0Var.a.a("TrustedContacts.Edit.Shown", new HashMap(), 1, new HashMap());
        aVar.Kg();
        requestApplyInsets();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ylr0) getBinding()).b.setAdapter(null);
        this.presenter.Cg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyi0
    public void render(xlr0 uiState) {
        ylr0 ylr0Var = (ylr0) getBinding();
        if (!(uiState instanceof vlr0)) {
            if (!jl40.l(uiState, wlr0.a)) {
                w511.b();
                return;
            } else {
                cma1.M(ylr0Var.d);
                cma1.J(ylr0Var.f);
                return;
            }
        }
        cma1.L(ylr0Var.f);
        cma1.J(ylr0Var.d);
        wkr0 wkr0Var = this.adapter;
        if (wkr0Var != null) {
            wkr0Var.submitList(((vlr0) uiState).a, null);
        }
    }
}
