package xsna;

import android.content.Context;
import android.os.SystemClock;
import com.vk.api.generated.shortVideo.dto.ShortVideoEditResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vkontakte.android.R;
import com.vkontakte.android.data.PrivacyRulesLocal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.lgj0;

/* compiled from: ClipsPrivacyUtils.kt */
/* loaded from: classes16.dex */
public final class ywe {
    public static final Object a = msy.a(LazyThreadSafetyMode.NONE, new f4(7));

    /* compiled from: ClipsPrivacyUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PostingVisibilityMode.values().length];
            try {
                iArr[PostingVisibilityMode.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingVisibilityMode.FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PostingVisibilityMode.ONLY_ME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PostingVisibilityMode.LISTS_FRIENDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PostingVisibilityMode.UNAVAILABLE_FRIENDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PrivacyViewer.values().length];
            try {
                iArr2[PrivacyViewer.SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[PrivacyViewer.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: ClipsPrivacyUtils.kt */
    public static final class b implements hx2<ShortVideoEditResponseDto> {
        public final /* synthetic */ izs<VKApiExecutionException, s3q0> b;
        public final /* synthetic */ VideoFile c;

        public b(VideoFile videoFile, izs izsVar) {
            this.b = izsVar;
            this.c = videoFile;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v5, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map] */
        @Override // xsna.hx2
        public final void b(ShortVideoEditResponseDto shortVideoEditResponseDto) {
            ?? r3;
            LinkedHashMap linkedHashMap;
            List<CoOwnerItem> list;
            VideoVideoFullDto d = shortVideoEditResponseDto.d();
            if (d == null) {
                this.b.invoke(null);
                return;
            }
            VideoFile videoFile = this.c;
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile == null || (list = clipVideoFile.N1) == null) {
                r3 = 0;
            } else {
                List<CoOwnerItem> list2 = list;
                r3 = new ArrayList(c5g.u(list2, 10));
                for (CoOwnerItem coOwnerItem : list2) {
                    r3.add(new Pair(coOwnerItem.b, coOwnerItem.d));
                }
            }
            if (r3 == 0) {
                r3 = EmptyList.b;
            }
            ums0 ums0Var = ums0.a;
            Owner s = videoFile.s();
            Map f = s != null ? on00.f(new Pair(videoFile.I0(), s)) : null;
            if (f == null) {
                f = jgp.b;
            }
            Iterable iterable = (Iterable) r3;
            if (f.isEmpty()) {
                linkedHashMap = pn00.s(iterable);
            } else {
                linkedHashMap = new LinkedHashMap(f);
                pn00.p(linkedHashMap, iterable);
            }
            VideoFileOld d2 = ums0.d(ums0Var, d, linkedHashMap, null, null, 16);
            d2.A0 = SystemClock.elapsedRealtime();
            wjs0.a(new fyr0(d2));
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            izs<VKApiExecutionException, s3q0> izsVar = this.b;
            if (izsVar != null) {
                izsVar.invoke(vKApiExecutionException);
            }
        }
    }

    public static String a(int i, int i2, Context context) {
        if (i == 0 || i2 == 0) {
            return String.format(context.getString(R.string.clips_privacy_forbidden_friends_or_lists), Arrays.copyOf(new Object[]{i != 0 ? enj.f(R.plurals.privacy_clip_forbidden_friends, i, context) : enj.f(R.plurals.privacy_clip_forbidden_friends_lists, i2, context)}, 1));
        }
        return String.format(context.getString(R.string.clips_privacy_forbidden_friends_and_lists), Arrays.copyOf(new Object[]{enj.f(R.plurals.privacy_clip_forbidden_friends, i, context), enj.f(R.plurals.privacy_clip_forbidden_friends_lists, i2, context)}, 2));
    }

    public static jx2 b(VideoFile videoFile, PrivacySetting privacySetting, PrivacySetting privacySetting2, Boolean bool, izs izsVar) {
        return new jx2(yfb.x(lgj0.a.b(new ngj0(), videoFile.I0(), videoFile.o0(), videoFile.j1(), privacySetting != null ? Collections.singletonList(privacySetting.zb()) : null, privacySetting2 != null ? Collections.singletonList(privacySetting2.zb()) : null, bool, null, null, null, null, 32704)), new b(videoFile, izsVar));
    }

    public static List c(boolean z, boolean z2) {
        return z ? Collections.singletonList(PrivacyRules.b) : z2 ? Collections.singletonList(PrivacyRules.h) : Collections.singletonList(PrivacyRules.a);
    }

    public static String d(Context context, PrivacySetting privacySetting, List list, List list2, PrivacyViewer privacyViewer) {
        int i = a.$EnumSwitchMapping$1[privacyViewer.ordinal()];
        if (i != 1 && i != 2) {
            return "";
        }
        if (!list.isEmpty() || !list2.isEmpty()) {
            return g620.f().getPrivacy().k(context, list, list2);
        }
        PostingVisibilityMode f = f(privacySetting);
        switch (f == null ? -1 : a.$EnumSwitchMapping$0[f.ordinal()]) {
            case 1:
                return context.getString(R.string.privacy_edit_clip_all);
            case 2:
                return context.getString(R.string.privacy_edit_clip_friends);
            case 3:
                return context.getString(R.string.privacy_edit_clip_best_friends);
            case 4:
                return context.getString(R.string.privacy_edit_clip_only_me);
            case 5:
            default:
                return null;
            case 6:
                return context.getString(R.string.privacy_edit_clip_unavailable_friends);
            case 7:
                return context.getString(R.string.privacy_edit_clip_unavailable_friends_and_friends_of_friends);
            case 8:
                return g620.f().getPrivacy().g(context);
        }
    }

    public static Pair e(List list) {
        ArrayList<UserId> arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof PrivacyRules.Exclude) {
                arrayList2.add(obj);
            }
        }
        PrivacyRules.Exclude exclude = (PrivacyRules.Exclude) j5g.b0(0, arrayList2);
        if (exclude == null || (arrayList = exclude.c) == null) {
            EmptyList emptyList = EmptyList.b;
            return new Pair(emptyList, emptyList);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<UserId> it = arrayList.iterator();
        while (it.hasNext()) {
            UserId next = it.next();
            long j = next.b;
            if (j < 2000000000) {
                arrayList3.add(next);
            } else {
                arrayList4.add(Integer.valueOf((int) (j - 2000000000)));
            }
        }
        return new Pair(arrayList3, arrayList4);
    }

    public static PostingVisibilityMode f(PrivacySetting privacySetting) {
        List<PrivacySetting.PrivacyRule> list = privacySetting.e;
        if (list.contains(PrivacyRules.a)) {
            return PostingVisibilityMode.ALL;
        }
        if (list.contains(PrivacyRules.h)) {
            return PostingVisibilityMode.FRIENDS;
        }
        if (list.contains(PrivacyRules.m)) {
            return PostingVisibilityMode.BEST_FRIENDS;
        }
        if (list.contains(PrivacyRules.n)) {
            return PostingVisibilityMode.BEST_FRIENDS;
        }
        if (list.contains(PrivacyRules.b)) {
            return PostingVisibilityMode.ONLY_ME;
        }
        if (list.contains(PrivacyRules.k)) {
            return PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_OF_FRIENDS;
        }
        if (list.contains(PrivacyRules.i)) {
            return PostingVisibilityMode.UNAVAILABLE_FRIENDS;
        }
        if (list.contains(PrivacyRulesLocal.a)) {
            return PostingVisibilityMode.UNAVAILABLE_FRIENDS_AND_FRIENDS_LISTS;
        }
        return null;
    }

    public static List g(VideoFile videoFile, boolean z) {
        boolean z2 = (videoFile == null || fkq0.b(videoFile.I0())) ? false : true;
        if (z && videoFile != null && !videoFile.getPrivacy().isEmpty()) {
            return videoFile.getPrivacy();
        }
        if (!z && videoFile != null && !videoFile.i6().isEmpty()) {
            return videoFile.i6();
        }
        if (z2 && o25.a().d()) {
            if (qr.f(videoFile != null ? videoFile.I0() : null)) {
                return Collections.singletonList(PrivacyRules.h);
            }
        }
        return Collections.singletonList(PrivacyRules.a);
    }

    public static List h(PostingVisibilityMode postingVisibilityMode) {
        boolean d = o25.a().d();
        boolean z = (g620.f().e().p().isEmpty() && g620.f().e().c().isEmpty()) ? false : true;
        switch (a.$EnumSwitchMapping$0[postingVisibilityMode.ordinal()]) {
            case 1:
                return Collections.singletonList(d ? PrivacyRules.h : PrivacyRules.a);
            case 2:
                return Collections.singletonList(PrivacyRules.h);
            case 3:
                return Collections.singletonList(PrivacyRules.m);
            case 4:
                return Collections.singletonList(PrivacyRules.b);
            case 5:
                return Collections.singletonList(PrivacyRules.o);
            case 6:
                return Collections.singletonList(PrivacyRules.i);
            case 7:
                return Collections.singletonList(PrivacyRules.k);
            case 8:
                if (z) {
                    return Collections.singletonList(PrivacyRulesLocal.a);
                }
                return Collections.singletonList(d ? PrivacyRules.h : PrivacyRules.a);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static PostingVisibilityMode i() {
        if (!o25.a().d()) {
            return g620.f().getPrivacy().h();
        }
        PostingVisibilityMode h = g620.f().getPrivacy().h();
        int i = a.$EnumSwitchMapping$0[h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 8) {
                        h = o25.a().d() ? PostingVisibilityMode.FRIENDS : PostingVisibilityMode.ALL;
                        g620.f().getPrivacy().f(h);
                    }
                }
            }
            return h;
        }
        PostingVisibilityMode postingVisibilityMode = o25.a().d() ? PostingVisibilityMode.FRIENDS : PostingVisibilityMode.ALL;
        g620.f().getPrivacy().f(postingVisibilityMode);
        return postingVisibilityMode;
    }
}
