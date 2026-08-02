package xsna;

import android.widget.EditText;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.dto.user.ImageStatus;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.imageloader.view.VKImageView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.stat.data.cache.StoryStatisticsDatabase_Impl;
import com.vk.superapp.ui.SuperAppFragment;
import com.vkontakte.android.R;
import xsna.ibk0;
import xsna.m5u;
import xsna.sx40;
import xsna.uam0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class in60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ in60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ibk0.a[] aVarArr;
        int i;
        switch (this.b) {
            case 0:
                return ((jn60) this.c).b.getValue();
            case 1:
                return wzi0.a((vzi0) ((mtk0) this.c).getValue());
            case 2:
                return Integer.valueOf(((mc90) this.c).r());
            case 3:
                ((c290) this.c).i = null;
                return s3q0.a;
            case 4:
                return (ucg0) ((rn90) this.c).t.getValue();
            case 5:
                return ((pr90) this.c).zn();
            case 6:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i2 = PhotoFlowFragment.m0;
                return ((BridgeComponent) photoFlowFragment.e0.getValue()).a0();
            case 7:
                ((fea0) this.c).a();
                return s3q0.a;
            case 8:
                return Float.valueOf(swe0.f(((szm) this.c).a.a(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            case 9:
                return (VKImageView) ((rhb0) this.c).itemView.findViewById(R.id.audio_playing_indicator);
            case 10:
                return ((BridgeComponent) ((rkd0) this.c).c.getValue()).F().h0();
            case 11:
                ((lbe) this.c).invoke(m5u.h.b);
                return s3q0.a;
            case 12:
                return (qae0) this.c;
            case 13:
                return Boolean.valueOf(((androidx.compose.foundation.gestures.l) this.c).o);
            case 14:
                return new ws4(((boi0) this.c).g);
            case 15:
                return (EditText) ((com.vk.sharing.core.view.f) this.c).findViewById(R.id.sharing_comment_input_wall_post);
            case 16:
                ibk0 ibk0Var = (ibk0) this.c;
                do {
                    synchronized (ibk0Var.g) {
                        try {
                            if (!ibk0Var.c) {
                                ibk0Var.c = true;
                                try {
                                    ci50<ibk0.a> ci50Var = ibk0Var.f;
                                    ibk0.a[] aVarArr2 = ci50Var.b;
                                    int i3 = ci50Var.d;
                                    int i4 = 0;
                                    while (i4 < i3) {
                                        ibk0.a aVar = aVarArr2[i4];
                                        qh50<Object> qh50Var = aVar.g;
                                        izs<Object, s3q0> izsVar = aVar.a;
                                        Object[] objArr = qh50Var.b;
                                        long[] jArr = qh50Var.a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i5 = 0;
                                            while (true) {
                                                long j = jArr[i5];
                                                aVarArr = aVarArr2;
                                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i6 = 8;
                                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                    int i8 = 0;
                                                    while (i8 < i7) {
                                                        if ((j & 255) < 128) {
                                                            i = i6;
                                                            izsVar.invoke(objArr[(i5 << 3) + i8]);
                                                        } else {
                                                            i = i6;
                                                        }
                                                        j >>= i;
                                                        i8++;
                                                        i6 = i;
                                                    }
                                                    if (i7 != i6) {
                                                    }
                                                }
                                                if (i5 != length) {
                                                    i5++;
                                                    aVarArr2 = aVarArr;
                                                }
                                            }
                                        } else {
                                            aVarArr = aVarArr2;
                                        }
                                        qh50Var.f();
                                        i4++;
                                        aVarArr2 = aVarArr;
                                    }
                                    ibk0Var.c = false;
                                } catch (Throwable th) {
                                    ibk0Var.c = false;
                                    throw th;
                                }
                            }
                            s3q0 s3q0Var = s3q0.a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } while (ibk0Var.c());
                return s3q0.a;
            case 17:
                szk0.c("button_click", (ImageStatus) this.c);
                return s3q0.a;
            case 18:
                jfl0 jfl0Var = (jfl0) this.c;
                sx40.b0 b0Var = sx40.b0.b;
                jfl0Var.getClass();
                xn50.a.c(jfl0Var, b0Var);
                dw20 dw20Var = jfl0Var.x;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 19:
                return ((MarketComponent) ((k7m) m7m.f((wjl0) this.c)).a(fpf0.a(MarketComponent.class))).Y4();
            case 20:
                return ((StoriesComponent) ((k7m) m7m.f((arl0) this.c)).a(fpf0.a(StoriesComponent.class))).f6();
            case 21:
                return ((StoryEditorExtDepsComponent) m7m.a(((e7m0) this.c).l).a(fpf0.a(StoryEditorExtDepsComponent.class))).R();
            case 22:
                xsw xswVar = ((uam0.a) this.c).k;
                if (xswVar != null) {
                    xswVar.invoke();
                }
                return s3q0.a;
            case 23:
                return new agm0((StoryStatisticsDatabase_Impl) this.c);
            case 24:
                return new gp80(((r0n0) this.c).a);
            case 25:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) this.c;
                qcy<Object>[] qcyVarArr = SuggestedPostsFragment.r0;
                return suggestedPostsFragment;
            case 26:
                SuperAppFragment superAppFragment = (SuperAppFragment) this.c;
                int i9 = SuperAppFragment.o0;
                return ((VkClientMultiAccountComponent) m7m.d(superAppFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 27:
                return ((ToolbarRedesignVh) this.c).s.c;
            case 28:
                ((slq0) this.c).a(UserProfileAction.o.b);
                return s3q0.a;
            default:
                return ((vxq0) this.c).n().a;
        }
    }
}
