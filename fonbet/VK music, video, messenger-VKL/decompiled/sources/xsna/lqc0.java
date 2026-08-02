package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.feature.model.PostingAuthorUiModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.dw20;
import xsna.kqc0;
import xsna.mk50;
import xsna.sqc0;

/* compiled from: PostingWithAuthorBottomSheetMvi.kt */
/* loaded from: classes4.dex */
public final class lqc0 extends tl50<oqc0, yqc0, kqc0> {
    public static final /* synthetic */ qcy<Object>[] q1;
    public vcc0 j1;
    public y5 k1;
    public ye80 l1;
    public kb40 m1;
    public kgc0 n1;
    public final nf3 i1 = new nf3();
    public final utk0 o1 = vtk0.a(Boolean.FALSE);
    public final Object p1 = msy.a(LazyThreadSafetyMode.NONE, new tu80(this, 12));

    /* compiled from: PostingWithAuthorBottomSheetMvi.kt */
    public static final class a extends dw20.b {
        public final PostingCreationEntryPoint e;
        public final kgc0 f;
        public final vcc0 g;

        public a(Context context, PostingCreationEntryPoint postingCreationEntryPoint, kgc0 kgc0Var, UserId userId, vcc0 vcc0Var) {
            super(context, tzp0.a(null, 3));
            this.e = postingCreationEntryPoint;
            this.f = kgc0Var;
            this.g = vcc0Var;
            x(0);
            u(0);
            c(new cpo(false, 0, 7));
            F0(true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            lqc0 lqc0Var = new lqc0();
            lqc0Var.setArguments(yfb.b(new Pair("ARG_CREATION_ENTRY_POINT", this.e.name())));
            lqc0Var.j1 = this.g;
            lqc0Var.n1 = this.f;
            return lqc0Var;
        }
    }

    /* compiled from: PostingWithAuthorBottomSheetMvi.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingContentType.Type.values().length];
            try {
                iArr[PostingContentType.Type.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingContentType.Type.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingContentType.Type.CLIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingContentType.Type.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingContentType.Type.LIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingContentType.Type.PHOTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingContentType.Type.CHANNEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(lqc0.class, "contentView", "getContentView()Lcom/vk/newsfeed/impl/items/posting/item/modals/feed_posting/feature/posting/PostingWithAuthorView;", 0);
        fpf0.a.getClass();
        q1 = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        tqc0 tqc0Var = new tqc0(this, requireContext(), this.o1);
        qcy<Object> qcyVar = q1[0];
        nf3 nf3Var = this.i1;
        nf3Var.c = tqc0Var;
        return new mk50.c(((tqc0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((tqc0) this.i1.getValue(this, q1[0])).f((yqc0) ao50Var, new ae8(1, this, lqc0.class, "sendAction", "sendAction(Lcom/vk/newsfeed/impl/items/posting/item/modals/feed_posting/feature/posting/PostingWithAuthorAction;)V", 0, 8));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((oqc0) vk50Var).g.a(new bk30(this, 19), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return super.a0();
        }
        kb40 kb40Var = this.m1;
        return kb40Var != null ? ((Boolean) kb40Var.invoke(activity)).booleanValue() : super.a0();
    }

    public final void bo(PostingContentType postingContentType, PostingAuthorUiModel postingAuthorUiModel) {
        String str;
        kgc0 kgc0Var = this.n1;
        if (kgc0Var == null) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("ARG_CREATION_ENTRY_POINT")) == null) {
            str = "";
        }
        PostingCreationEntryPoint.Companion.getClass();
        PostingCreationEntryPoint a2 = PostingCreationEntryPoint.a.a(str);
        UserId e = postingAuthorUiModel.e();
        switch (b.$EnumSwitchMapping$0[postingContentType.c.ordinal()]) {
            case 1:
                kgc0Var.F5(a2, true, e, postingAuthorUiModel.d());
                return;
            case 2:
                kgc0Var.d2(true, new dic0(e, postingAuthorUiModel.f(), postingAuthorUiModel.g()), a2);
                return;
            case 3:
                kgc0Var.I0(e, a2, true);
                return;
            case 4:
                kgc0Var.d7(e, a2);
                return;
            case 5:
                kgc0Var.w5(true, a2);
                return;
            case 6:
                kgc0Var.x1(true, a2);
                return;
            case 7:
                kgc0Var.L3(a2);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // xsna.tl50, xsna.xn50
    /* renamed from: co, reason: merged with bridge method [inline-methods] */
    public final void e2(kqc0 kqc0Var) {
        if (!(kqc0Var instanceof kqc0.d)) {
            getFeature().C(kqc0Var);
            return;
        }
        kqc0.d dVar = (kqc0.d) kqc0Var;
        bo(dVar.b, dVar.c);
        dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        vcc0 vcc0Var = this.j1;
        return new oqc0((wcc0) this.p1.getValue(), vcc0Var != null ? new sqc0.c(vcc0Var) : sqc0.b.b);
    }
}
