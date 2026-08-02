package com.yandex.go.payments.shared.family.invites.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.abp;
import defpackage.bbp;
import defpackage.cma1;
import defpackage.czo0;
import defpackage.dbp;
import defpackage.e6h0;
import defpackage.ebp;
import defpackage.evu0;
import defpackage.g16;
import defpackage.hbp0;
import defpackage.luh0;
import defpackage.mrg0;
import defpackage.myk0;
import defpackage.nfv;
import defpackage.ny61;
import defpackage.obv;
import defpackage.owx;
import defpackage.pav;
import defpackage.qdb1;
import defpackage.tje;
import defpackage.tse0;
import defpackage.uhm;
import defpackage.y9p;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B#\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020'8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/yandex/go/payments/shared/family/invites/ui/FamilyInviteView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ldbp;", "Labp;", "Landroid/content/Context;", "context", "Lbbp;", "presenter", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lbbp;Lpav;)V", "", "imageTag", "Lzy11;", "loadBackground", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageUrl", "loadAvatar", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ldbp;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "isArrowsPermanentlyHidden", "()Z", "settlingLayoutChanges", "Lowx$c;", "invite", "render", "(Lowx$c;)V", "close", "Lbbp;", "Lpav;", "", "cornersRadius", CA20Status.STATUS_USER_I, "padding", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "closeButton", "Lru/yandex/taxi/design/FloatButtonIconComponent;", "Lhbp0;", "scopeDelegate", "Lhbp0;", "getCornerRadius", "()I", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FamilyInviteView extends SlideableBindingModalView<dbp> implements abp {
    public static final int $stable = 8;
    private final FloatButtonIconComponent closeButton;
    private final int cornersRadius;
    private final pav imageLoader;
    private final int padding;
    private final bbp presenter;
    private final hbp0 scopeDelegate;

    public FamilyInviteView(Context context, bbp bbpVar, pav pavVar) {
        super(context);
        this.presenter = bbpVar;
        this.imageLoader = pavVar;
        int u = tje.u(24, getContext());
        this.cornersRadius = u;
        int r = tje.r(mrg0.go_design_s_space, getContext());
        this.padding = r;
        this.scopeDelegate = new hbp0(new czo0(14), "", null);
        float f = u;
        new myk0(getBottomSheet()).b(f, f);
        setPadding(r, 0, r, r);
        this.closeButton = qdb1.c(this, new uhm(26, bbpVar));
        getBinding().b.setDebounceClickListener(new uhm(27, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FamilyInviteView familyInviteView) {
        bbp bbpVar = familyInviteView.presenter;
        ebp ebpVar = bbpVar.B;
        String str = bbpVar.x.a;
        y9p y9pVar = ebpVar.a;
        y9pVar.a.a("FamilyAccount.Invite.Card.ActionButtonTap", tse0.n(y9pVar), 1, new HashMap());
        tje.N(bbpVar.Jg(), null, null, new FamilyInvitePresenter$onAcceptClicked$1(bbpVar, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onCloseClicked(bbp bbpVar) {
        ebp ebpVar = bbpVar.B;
        String str = bbpVar.x.a;
        y9p y9pVar = ebpVar.a;
        HashMap n = tse0.n(y9pVar);
        if (str != null) {
            n.put("invite_id", str);
        }
        y9pVar.a.a("FamilyAccount.Invite.Card.Closed", n, 1, new HashMap());
        ((abp) bbpVar.Dg()).close();
    }

    public static final /* synthetic */ dbp access$getBinding(FamilyInviteView familyInviteView) {
        return familyInviteView.getBinding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        getBinding().c.setImageResource(defpackage.f1h0.yandex_avatar);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadAvatar(String str, Continuation<? super zy11> continuation) {
        FamilyInviteView$loadAvatar$1 familyInviteView$loadAvatar$1;
        int i;
        if (continuation instanceof FamilyInviteView$loadAvatar$1) {
            familyInviteView$loadAvatar$1 = (FamilyInviteView$loadAvatar$1) continuation;
            int i2 = familyInviteView$loadAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyInviteView$loadAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = familyInviteView$loadAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyInviteView$loadAvatar$1.label;
                if (i != 0) {
                    b.b(obj);
                    g16 e = this.imageLoader.b().b(str).e(nfv.a);
                    familyInviteView$loadAvatar$1.L$0 = null;
                    familyInviteView$loadAvatar$1.label = 1;
                    obj = e.a(familyInviteView$loadAvatar$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                getBinding().c.setImageBitmap((Bitmap) obj);
                return zy11.a;
            }
        }
        familyInviteView$loadAvatar$1 = new FamilyInviteView$loadAvatar$1(this, continuation);
        Object obj2 = familyInviteView$loadAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInviteView$loadAvatar$1.label;
        if (i != 0) {
        }
        getBinding().c.setImageBitmap((Bitmap) obj2);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|26|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        getBinding().e.setVisibility(8);
        getBinding().d.setImageResource(defpackage.y2h0.bg_invite_fallback);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadBackground(String str, Continuation<? super zy11> continuation) {
        FamilyInviteView$loadBackground$1 familyInviteView$loadBackground$1;
        int i;
        if (continuation instanceof FamilyInviteView$loadBackground$1) {
            familyInviteView$loadBackground$1 = (FamilyInviteView$loadBackground$1) continuation;
            int i2 = familyInviteView$loadBackground$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                familyInviteView$loadBackground$1.label = i2 - Integer.MIN_VALUE;
                Object obj = familyInviteView$loadBackground$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = familyInviteView$loadBackground$1.label;
                if (i != 0) {
                    b.b(obj);
                    getBinding().e.setVisibility(0);
                    g16 i3 = this.imageLoader.b().i(new obv(str, null, 6, 0));
                    familyInviteView$loadBackground$1.L$0 = null;
                    familyInviteView$loadBackground$1.label = 1;
                    obj = i3.a(familyInviteView$loadBackground$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                getBinding().e.setVisibility(8);
                getBinding().d.setImageBitmap((Bitmap) obj);
                return zy11.a;
            }
        }
        familyInviteView$loadBackground$1 = new FamilyInviteView$loadBackground$1(this, continuation);
        Object obj2 = familyInviteView$loadBackground$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = familyInviteView$loadBackground$1.label;
        if (i != 0) {
        }
        getBinding().e.setVisibility(8);
        getBinding().d.setImageBitmap((Bitmap) obj2);
        return zy11.a;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public dbp bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(luh0.family_invite_view, parent, false);
        int i = e6h0.accept_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = e6h0.avatar_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView != null) {
                i = e6h0.background_image;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
                if (appCompatImageView2 != null) {
                    i = e6h0.background_placeholder;
                    PlaceholderView placeholderView = (PlaceholderView) cma1.O(i, inflate);
                    if (placeholderView != null) {
                        i = e6h0.family_info_group;
                        Group group = (Group) cma1.O(i, inflate);
                        if (group != null) {
                            i = e6h0.family_info_subtitle_view;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) cma1.O(i, inflate);
                            if (appCompatTextView != null) {
                                i = e6h0.family_info_title_view;
                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) cma1.O(i, inflate);
                                if (appCompatTextView2 != null) {
                                    i = e6h0.main_text_view;
                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) cma1.O(i, inflate);
                                    if (appCompatTextView3 != null) {
                                        return new dbp((ConstraintLayout) inflate, buttonComponent, appCompatImageView, appCompatImageView2, placeholderView, group, appCompatTextView, appCompatTextView2, appCompatTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.abp
    public void close() {
        dismiss();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius, reason: from getter */
    public int getCardCornerRadius() {
        return this.cornersRadius;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ConstraintLayout constraintLayout = getBinding().a;
        if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
            constraintLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView$onAttachedToWindow$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ViewGroup.LayoutParams layoutParams = FamilyInviteView.access$getBinding(FamilyInviteView.this).a.getLayoutParams();
                    layoutParams.height = FamilyInviteView.this.getContent().getMeasuredHeight() - FamilyInviteView.this.closeButton.getMeasuredHeight();
                    FamilyInviteView.access$getBinding(FamilyInviteView.this).a.setLayoutParams(layoutParams);
                }
            });
        } else {
            ViewGroup.LayoutParams layoutParams = access$getBinding(this).a.getLayoutParams();
            layoutParams.height = getContent().getMeasuredHeight() - this.closeButton.getMeasuredHeight();
            access$getBinding(this).a.setLayoutParams(layoutParams);
        }
        requestFocus();
        this.scopeDelegate.a();
        bbp bbpVar = this.presenter;
        bbpVar.Bg(this);
        owx.c cVar = bbpVar.x;
        render(cVar);
        ebp ebpVar = bbpVar.B;
        String str = cVar.a;
        y9p y9pVar = ebpVar.a;
        HashMap n = tse0.n(y9pVar);
        if (str != null) {
            n.put("invite_id", str);
        }
        y9pVar.a.a("FamilyAccount.Invite.Card.Shown", n, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.scopeDelegate.b();
    }

    @Override // defpackage.abp
    public void render(owx.c invite) {
        tje.N(this.scopeDelegate.c(), null, null, new FamilyInviteView$render$1(this, invite, null), 3);
        getBinding().i.setText(invite.d);
        getBinding().b.setText(invite.e);
        owx.b bVar = invite.f;
        if (bVar == null) {
            getBinding().f.setVisibility(8);
            return;
        }
        String str = bVar.b;
        String str2 = bVar.a;
        tje.N(this.scopeDelegate.c(), null, null, new FamilyInviteView$render$2(this, bVar, null), 3);
        if (evu0.J(str2)) {
            getBinding().f.setVisibility(8);
        } else {
            getBinding().h.setText(str2);
        }
        if (evu0.J(str)) {
            getBinding().g.setVisibility(8);
        } else {
            getBinding().g.setText(str);
        }
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public boolean settlingLayoutChanges() {
        return false;
    }
}
