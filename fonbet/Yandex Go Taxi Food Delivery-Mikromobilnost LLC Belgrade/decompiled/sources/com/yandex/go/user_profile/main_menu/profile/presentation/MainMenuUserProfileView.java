package com.yandex.go.user_profile.main_menu.profile.presentation;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.cma1;
import defpackage.hg;
import defpackage.i3y;
import defpackage.j600;
import defpackage.k600;
import defpackage.kyh0;
import defpackage.l600;
import defpackage.mqu;
import defpackage.n600;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.oeh0;
import defpackage.qje;
import defpackage.r600;
import defpackage.rqh0;
import defpackage.s600;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tls;
import defpackage.u600;
import defpackage.usg0;
import defpackage.v600;
import defpackage.w511;
import defpackage.w600;
import defpackage.x600;
import defpackage.xng0;
import defpackage.xyz;
import defpackage.z600;
import defpackage.zgv;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.buttons.LoadingCircleButtonImageView;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u00020\r2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/user_profile/main_menu/profile/presentation/MainMenuUserProfileView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lx600;", "plateBackground", "Lzy11;", "renderStatusBackground", "(Lx600;)V", "Lr600;", ClidProvider.STATE, "renderAvatarState", "(Lr600;)V", "Lz600;", "uiState", "render", "(Lz600;)V", "Lkotlin/Function1;", "Ll600;", "listener", "setActionListener", "(Ltls;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Ln600;", "binding", "Ln600;", "", "statusLabel$delegate", "Li3y;", "getStatusLabel", "()Ljava/lang/String;", "statusLabel", "actionListener", "Ltls;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MainMenuUserProfileView extends ConstraintLayout implements nwy0 {
    private tls actionListener;
    private final n600 binding;

    /* renamed from: statusLabel$delegate, reason: from kotlin metadata */
    private final i3y statusLabel;

    public MainMenuUserProfileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(rqh0.main_menu_user_profile, this);
        int i2 = oeh0.user_name;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
        if (listItemComponent != null) {
            i2 = oeh0.user_photo;
            LoadingCircleButtonImageView loadingCircleButtonImageView = (LoadingCircleButtonImageView) cma1.O(i2, this);
            if (loadingCircleButtonImageView != null) {
                i2 = oeh0.user_status;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                if (robotoTextView != null) {
                    this.binding = new n600(this, listItemComponent, loadingCircleButtonImageView, robotoTextView);
                    this.statusLabel = a.b(LazyThreadSafetyMode.NONE, new xyz(6, this));
                    hg.a(this);
                    hg.a(loadingCircleButtonImageView);
                    setBackgroundColor(qje.t(xng0.bgMain, getContext()));
                    setOnClickListener(new zgv(8, this));
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(MainMenuUserProfileView mainMenuUserProfileView, View view) {
        tls tlsVar = mainMenuUserProfileView.actionListener;
        if (tlsVar != null) {
            tlsVar.invoke(k600.a);
        }
    }

    private final String getStatusLabel() {
        return (String) this.statusLabel.getValue();
    }

    private final void renderAvatarState(r600 state) {
        int i;
        n600 n600Var = this.binding;
        n600Var.c.setImageDrawable(state.b);
        LoadingCircleButtonImageView loadingCircleButtonImageView = n600Var.c;
        loadingCircleButtonImageView.setLoading(state.a);
        c.z(new mqu(29, this, state), loadingCircleButtonImageView);
        LoadingCircleButtonImageView loadingCircleButtonImageView2 = this.binding.c;
        l600 l600Var = state.c;
        if (l600Var.equals(k600.a)) {
            i = 2;
        } else {
            if (!l600Var.equals(j600.a)) {
                w511.b();
                return;
            }
            i = 1;
        }
        loadingCircleButtonImageView2.setImportantForAccessibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderAvatarState$lambda$0$0(MainMenuUserProfileView mainMenuUserProfileView, r600 r600Var) {
        tls tlsVar = mainMenuUserProfileView.actionListener;
        if (tlsVar != null) {
            tlsVar.invoke(r600Var.c);
        }
        return zy11.a;
    }

    private final void renderStatusBackground(x600 plateBackground) {
        float[] fArr;
        RobotoTextView robotoTextView = this.binding.d;
        ShapeDrawable shapeDrawable = null;
        if (plateBackground instanceof w600) {
            int m = s8o.m(((w600) plateBackground).a, getContext());
            float r = tje.r(usg0.profile_status_corners, getContext());
            if (r == 0.0f || Float.isNaN(r) || Float.isInfinite(r)) {
                fArr = null;
            } else {
                fArr = new float[8];
                for (int i = 0; i < 8; i++) {
                    fArr[i] = r;
                }
            }
            RoundRectShape roundRectShape = new RoundRectShape(fArr, null, null);
            shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(roundRectShape);
            shapeDrawable.getPaint().setColor(m);
        } else if (plateBackground instanceof u600) {
            shapeDrawable = ((u600) plateBackground).a;
        } else if (!(plateBackground instanceof v600)) {
            w511.b();
            return;
        }
        robotoTextView.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String statusLabel_delegate$lambda$0(MainMenuUserProfileView mainMenuUserProfileView) {
        return c.G(kyh0.user_profile_status_label, mainMenuUserProfileView);
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        setBackgroundColor(qje.t(xng0.bgMain, getContext()));
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void render(z600 uiState) {
        if (uiState instanceof s600) {
            n600 n600Var = this.binding;
            ListItemComponent listItemComponent = n600Var.b;
            s600 s600Var = (s600) uiState;
            CharSequence charSequence = s600Var.c;
            CharSequence charSequence2 = s600Var.a;
            listItemComponent.setTitle(charSequence2);
            n600Var.d.setText(charSequence);
            setContentDescription(((Object) charSequence2) + ",  " + getStatusLabel() + Extension.COLON_SPACE + ((Object) charSequence));
            renderStatusBackground(s600Var.d);
            renderAvatarState(s600Var.b);
        }
    }

    public final void setActionListener(tls listener) {
        this.actionListener = listener;
    }

    public MainMenuUserProfileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MainMenuUserProfileView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MainMenuUserProfileView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
