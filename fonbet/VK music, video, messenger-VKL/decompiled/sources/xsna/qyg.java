package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResult;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewArgs;
import com.vk.ecomm.reviews.api.model.communityreviews.ReviewSavedData;
import com.vk.ecomm.reviews.api.model.createreview.CreateCommunityReviewData;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kyg;
import xsna.lrv0;
import xsna.mk50;
import xsna.xn50;

/* compiled from: CommunityCreateReviewDialog.kt */
/* loaded from: classes18.dex */
public final class qyg extends tl50<yyg, hzg, kyg> implements w8i, lrv0.a {
    public static final /* synthetic */ int n1 = 0;
    public o7k i1;
    public FrameLayout j1;
    public final hb0<Intent> k1 = registerForActivityResult(new cb0(), new b());
    public final bpn0 l1 = new bpn0(new nef(this, 3));
    public final Object m1 = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 29));

    /* compiled from: CommunityCreateReviewDialog.kt */
    public static final class a extends wpi {
        public final CreateCommunityReviewArgs g;

        public a(Context context, CreateCommunityReviewArgs createCommunityReviewArgs) {
            super(context, tzp0.a(null, 3));
            this.g = createCommunityReviewArgs;
            cpo cpoVar = new cpo(true, 0, 6);
            I(true);
            c(cpoVar);
            F0(true);
            x(0);
            p(true);
            D();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(fpf0.a(CreateCommunityReviewArgs.class).l(), this.g);
            qyg qygVar = new qyg();
            qygVar.setArguments(bundle);
            return qygVar;
        }
    }

    /* compiled from: CommunityCreateReviewDialog.kt */
    public static final /* synthetic */ class b implements ua0, g0t {
        public b() {
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ua0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, qyg.this, qyg.class, "handleReviewPhotoAttach", "handleReviewPhotoAttach(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
        @Override // xsna.ua0
        public final void onActivityResult(Object obj) {
            ?? r0;
            ArrayList parcelableArrayList;
            ActivityResult activityResult = (ActivityResult) obj;
            int i = qyg.n1;
            int i2 = activityResult.b;
            Intent intent = activityResult.c;
            if (i2 == -1 && intent != null && intent.hasExtra("result_attachments")) {
                Bundle bundleExtra = intent.getBundleExtra("result_attachments");
                if (bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) {
                    r0 = 0;
                } else {
                    r0 = new ArrayList(c5g.u(parcelableArrayList, 10));
                    Iterator it = parcelableArrayList.iterator();
                    while (it.hasNext()) {
                        r0.add(((Uri) it.next()).toString());
                    }
                }
                if (r0 == 0) {
                    r0 = EmptyList.b;
                }
                xn50.a.c(qyg.this, new kyg.d.c(r0));
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        o7k o7kVar = new o7k(this, requireContext(), getFeature().h);
        this.i1 = o7kVar;
        return new mk50.c(o7kVar.c());
    }

    @Override // xsna.dw20
    public final nw20 Fn(int i, Context context) {
        return new npi(context, i);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        hzg hzgVar = (hzg) ao50Var;
        o7k o7kVar = this.i1;
        if (o7kVar == null) {
            o7kVar = null;
        }
        o7kVar.f(hzgVar, new wi3(1, this, qyg.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        yyg yygVar = (yyg) vk50Var;
        yygVar.h.a(new i4e(this, 8), this);
        yygVar.i.a(new zx(this, 28), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, kyg.b.b);
        return true;
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        xn50.a.c(this, kyg.c.b);
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xn50.a.c(this, kyg.a.b);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        FrameLayout frameLayout = (FrameLayout) ((nw20) this.s).findViewById(R.id.bottom_sheet_content_holder);
        this.j1 = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_background_content)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r11 == null) goto L16;
     */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        CreateCommunityReviewArgs createCommunityReviewArgs;
        Parcelable parcelable;
        Object parcelable2;
        gyh U3 = ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).U3();
        Bundle arguments = getArguments();
        if (arguments != null) {
            String l = fpf0.a(CreateCommunityReviewArgs.class).l();
            if (l == null) {
                l = "";
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable(l, CreateCommunityReviewArgs.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable(l);
                if (!(parcelable3 instanceof CreateCommunityReviewArgs)) {
                    parcelable3 = null;
                }
                parcelable = (CreateCommunityReviewArgs) parcelable3;
            }
            createCommunityReviewArgs = (CreateCommunityReviewArgs) parcelable;
        }
        createCommunityReviewArgs = new CreateCommunityReviewArgs(null, null, null, null, null, 31, null);
        ReviewSavedData reviewSavedData = createCommunityReviewArgs.c;
        return new yyg(new ezg(new fzg(reviewSavedData != null ? (CreateCommunityReviewData) reviewSavedData : null, createCommunityReviewArgs.b, createCommunityReviewArgs.e, createCommunityReviewArgs.f, createCommunityReviewArgs.d, 1038841), new sni(false)), new cbb(), U3);
    }

    @Override // xsna.lrv0.a
    public final void xb() {
        FrameLayout frameLayout = this.j1;
        if (frameLayout != null) {
            frameLayout.setBackgroundTintList(ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_background_content)));
        }
    }
}
