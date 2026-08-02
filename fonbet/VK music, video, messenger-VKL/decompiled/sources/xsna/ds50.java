package xsna;

import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.entries.DisclaimerContent;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.Description;
import com.vk.feed.core.models.Text;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import com.vk.newsfeed.common.presentation.model.items.MyTargetNativeAdSinglePartUiDto;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.q1g;

/* compiled from: MyTargetNativeAdSingePartTransformer.kt */
/* loaded from: classes4.dex */
public final class ds50 implements gn60<MyTargetNativeAdEntry, wm60> {
    public static Description a(gjx gjxVar) {
        String str;
        wjz0 content = gjxVar.getContent();
        String str2 = null;
        if (content != null && (str = content.a.o) != null && myc0.f(str)) {
            str2 = str;
        }
        return d(str2);
    }

    public static String b(uy9 uy9Var, String str, String str2) {
        Long n;
        if (str == null || (n = arm0.n(str)) == null) {
            return null;
        }
        double longValue = n.longValue() / 100.0d;
        if (str2 == null) {
            str2 = "";
        }
        return uy9Var.b(longValue, str2, true).toString();
    }

    public static uf0 c(gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, boolean z) {
        vul vulVar;
        Float f;
        wjz0 content = gjxVar.getContent();
        float floatValue = (content == null || (vulVar = content.c) == null || (f = ((ocz0) vulVar.b).j) == null) ? 0.0f : f.floatValue();
        wjz0 content2 = gjxVar.getContent();
        return new uf0(content2 != null ? content2.a.n() : "", null, z, floatValue, myTargetNativeAdEntry, floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? dhr0.t.a(R.drawable.vk_icon_favorite_16) : null, null);
    }

    public static Description d(String str) {
        if (str != null) {
            return new Description(new Text(str, null), null, null, null, str, false, false, false, PsExtractor.AUDIO_STREAM, null);
        }
        return null;
    }

    public final List e(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        tq50 tq50Var;
        ArrayList<wix> arrayList;
        nr50 nr50Var;
        float height;
        lhz0 lhz0Var;
        ArrayList arrayList2;
        nnx nnxVar;
        HashMap hashMap;
        Description d;
        zu50 zu50Var = myTargetNativeAdEntry.z;
        boolean z = myTargetNativeAdEntry.x;
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (zu50Var != null) {
            cw50 d2 = zu50Var.d();
            if (d2 == null) {
                return EmptyList.b;
            }
            ArrayList arrayList3 = d2.w;
            bp50 bp50Var = myTargetNativeAdEntry.A;
            if (bp50Var == null) {
                return EmptyList.b;
            }
            String str = d2.h;
            if (str == null) {
                str = "";
            }
            float f = d2.c;
            uf0 uf0Var = new uf0(str, null, true, f, myTargetNativeAdEntry, f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? dhr0.t.a(R.drawable.vk_icon_favorite_16) : null, null);
            e0g e0gVar = d2.A;
            if (e0gVar != null) {
                ArrayList arrayList4 = e0gVar.a;
                HashMap hashMap2 = new HashMap();
                int size = arrayList4.size();
                for (int i = 0; i < size; i++) {
                    q1g.b bVar = ((q1g) arrayList4.get(i)).d;
                    if (bVar != null) {
                        Integer valueOf = Integer.valueOf(i);
                        int i2 = bVar.c;
                        gpt0 gpt0Var = gpt0.a;
                        hashMap2.put(valueOf, z8s.a(i2));
                    }
                }
                hashMap = hashMap2;
            } else {
                hashMap = null;
            }
            String str2 = d2.g;
            Description d3 = d(d2.l);
            Description d4 = d(d2.o);
            Description d5 = d(d2.i);
            String str3 = d2.a;
            if (epx.f(str3, X3.i.U)) {
                String str4 = d2.y;
                String str5 = d2.z;
                if (myc0.f(str4) && myc0.f(str5)) {
                    str4 = pzl.b(str4, ", ", str5);
                } else if (!myc0.f(str4)) {
                    str4 = myc0.f(str5) ? str5 : null;
                }
                d = d(str4);
            } else {
                String str6 = d2.n;
                if (!myc0.f(str6)) {
                    str6 = null;
                }
                d = d(str6);
            }
            Description description = d;
            u1c0 u1c0Var = new u1c0(uf0Var.b, myTargetNativeAdEntry);
            u1c0Var.h = uf0Var;
            return Collections.singletonList(new MyTargetNativeAdSinglePartUiDto(zu50Var, d2, null, str2, d3, d4, d5, str3, description, arrayList3, bp50Var, u1c0Var, myTargetNativeAdEntry, AdVkFeedItemState.AD_SHOWING, myTargetNativeAdEntry.r, hashMap, hashMap != null ? MyTargetNativeAdSinglePartUiDto.Type.COLLAGE : !arrayList3.isEmpty() ? MyTargetNativeAdSinglePartUiDto.Type.CAROUSEL : MyTargetNativeAdSinglePartUiDto.Type.STATIC, null));
        }
        if (gjxVar == null) {
            return EmptyList.b;
        }
        String str7 = myTargetNativeAdEntry.o;
        int hashCode = str7.hashCode();
        if (hashCode != -892481938) {
            if (hashCode != 2908512) {
                if (hashCode == 112202875 && str7.equals("video")) {
                    VideoAttachment videoAttachment = myTargetNativeAdEntry.u;
                    if (videoAttachment != null) {
                        if (videoAttachment.k instanceof ClipVideoFile) {
                            height = 1.3333334f;
                        } else {
                            wjz0 content = gjxVar.getContent();
                            height = (content == null || (lhz0Var = content.g) == null || (arrayList2 = lhz0Var.c) == null || (nnxVar = (nnx) j5g.b0(0, arrayList2)) == null) ? 1.0f : nnxVar.getHeight() / nnxVar.getWidth();
                        }
                        uf0 c = c(gjxVar, myTargetNativeAdEntry, videoAttachment.k instanceof ClipVideoFile);
                        AdVkFeedItemState adVkFeedItemState = z ? AdVkFeedItemState.HIDE_REASONS_SHOWING : AdVkFeedItemState.AD_SHOWING;
                        wjz0 content2 = gjxVar.getContent();
                        String str8 = content2 != null ? content2.a.f : null;
                        wjz0 content3 = gjxVar.getContent();
                        Description d6 = d(content3 != null ? content3.a.h : null);
                        wjz0 content4 = gjxVar.getContent();
                        Description d7 = d(content4 != null ? content4.a.r : null);
                        wjz0 content5 = gjxVar.getContent();
                        Description d8 = d(content5 != null ? content5.a.c : null);
                        Description a = a(gjxVar);
                        jq6 t = sni.t(videoAttachment);
                        u1c0 u1c0Var2 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, myTargetNativeAdEntry);
                        u1c0Var2.h = c;
                        s3q0 s3q0Var = s3q0.a;
                        nr50Var = new nr50(0, gjxVar, myTargetNativeAdEntry, adVkFeedItemState, str8, d6, d7, d8, a, t, u1c0Var2, height, videoAttachment.k instanceof ClipVideoFile);
                    } else {
                        nr50Var = null;
                    }
                    return e43.m(nr50Var);
                }
            } else if (str7.equals("carousel")) {
                wjz0 content6 = gjxVar.getContent();
                if (content6 != null && (arrayList = content6.h) != null) {
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        AdVkFeedItemState adVkFeedItemState2 = z ? AdVkFeedItemState.HIDE_REASONS_SHOWING : AdVkFeedItemState.AD_SHOWING;
                        wjz0 content7 = gjxVar.getContent();
                        String str9 = content7 != null ? content7.a.f : null;
                        wjz0 content8 = gjxVar.getContent();
                        Description d9 = d(content8 != null ? content8.a.h : null);
                        wjz0 content9 = gjxVar.getContent();
                        Description d10 = d(content9 != null ? content9.a.r : null);
                        wjz0 content10 = gjxVar.getContent();
                        Description d11 = d(content10 != null ? content10.a.c : null);
                        Description a2 = a(gjxVar);
                        uy9 uy9Var = new uy9();
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList, 10));
                        for (wix wixVar : arrayList) {
                            String title = wixVar.getTitle();
                            kbz0 image = wixVar.getImage();
                            arrayList5.add(new lp50(wixVar, title, image != null ? up50.e(image) : Image.d, wixVar.b(), wixVar.c(), wixVar.getDescription(), wixVar.d(), b(uy9Var, wixVar.a(), wixVar.c()), b(uy9Var, wixVar.getPrice(), wixVar.c())));
                        }
                        tq50 tq50Var2 = new tq50(gjxVar, myTargetNativeAdEntry, adVkFeedItemState2, str9, d9, d10, d11, a2, arrayList5);
                        wjz0 content11 = gjxVar.getContent();
                        ArrayList arrayList6 = content11 != null ? content11.h : null;
                        if (arrayList6 != null && !arrayList6.isEmpty()) {
                            tq50Var = tq50Var2;
                            return e43.m(tq50Var);
                        }
                    }
                }
                tq50Var = null;
                return e43.m(tq50Var);
            }
        } else if (str7.equals("static")) {
            uf0 c2 = c(gjxVar, myTargetNativeAdEntry, true);
            wjz0 content12 = gjxVar.getContent();
            String str10 = content12 != null ? content12.a.f : null;
            wjz0 content13 = gjxVar.getContent();
            Description d12 = d(content13 != null ? content13.a.h : null);
            wjz0 content14 = gjxVar.getContent();
            Description d13 = d(content14 != null ? content14.a.r : null);
            wjz0 content15 = gjxVar.getContent();
            Description d14 = d(content15 != null ? content15.a.c : null);
            Description a3 = a(gjxVar);
            EmptyList emptyList = EmptyList.b;
            u1c0 u1c0Var3 = new u1c0(Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE, myTargetNativeAdEntry);
            u1c0Var3.h = c2;
            AdVkFeedItemState adVkFeedItemState3 = AdVkFeedItemState.AD_SHOWING;
            DisclaimerContent disclaimerContent = myTargetNativeAdEntry.r;
            MyTargetNativeAdSinglePartUiDto.Type type = MyTargetNativeAdSinglePartUiDto.Type.INTERNAL_STATIC;
            wjz0 content16 = gjxVar.getContent();
            kbz0 kbz0Var = content16 != null ? content16.e : null;
            return Collections.singletonList(new MyTargetNativeAdSinglePartUiDto(null, null, gjxVar, str10, d12, d13, d14, null, a3, emptyList, null, u1c0Var3, myTargetNativeAdEntry, adVkFeedItemState3, disclaimerContent, null, type, kbz0Var != null ? new PhotoAttachment(new Photo(up50.e(kbz0Var))) : null));
        }
        return EmptyList.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public final /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return e((MyTargetNativeAdEntry) pair);
    }
}
