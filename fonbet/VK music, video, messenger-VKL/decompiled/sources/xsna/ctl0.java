package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeasBlock;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.toggle.b;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* compiled from: StoriesInteractorImpl.kt */
/* loaded from: classes6.dex */
public final class ctl0 implements xsl0, w8i {
    public final p870 b;
    public final lul0 c;
    public final lrl0 d;
    public final bsl0 e;
    public final otl0 f;
    public final Object g;
    public final Object h;

    /* compiled from: StoriesInteractorImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Set<? extends String>> {
        public static final /* synthetic */ int b = 0;

        static {
            new a(0, izi0.class, "emptySet", "emptySet()Ljava/util/Set;", 1);
        }

        @Override // xsna.gzs
        public final Set<? extends String> invoke() {
            return EmptySet.b;
        }
    }

    public ctl0(bvl0 bvl0Var, p870 p870Var, lul0 lul0Var, lrl0 lrl0Var, bsl0 bsl0Var, otl0 otl0Var) {
        this.b = p870Var;
        this.c = lul0Var;
        this.d = lrl0Var;
        this.e = bsl0Var;
        this.f = otl0Var;
        bvl0Var.c();
        bbb0 bbb0Var = new bbb0(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.g = msy.a(lazyThreadSafetyMode, bbb0Var);
        this.h = msy.a(lazyThreadSafetyMode, new b6f0(this, 8));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.q a(Integer num, String str, String str2) {
        ArrayList arrayList;
        avl0 avl0Var = this.c.a;
        List b = isl0.b();
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.getDiscover", new pq(21), new j8(28));
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "start_from", str2, 0, 0, 12);
        }
        tfxVar.f(num.intValue(), 1, 150, "count");
        tfxVar.j("extended", true);
        if (b != null) {
            List list = b;
            arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return rsg0.T(yfb.x(tfxVar)).U(new aad0(new jz30(13), 5)).U(new tj60(new kdw(20), 10));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.x<Boolean> b(StoryEntry storyEntry, int i) {
        UserId userId = storyEntry.d;
        this.c.a.getClass();
        tfx tfxVar = new tfx("stories.hideAllReplies", new yu50(10), new zil0(1));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        return new io.reactivex.rxjava3.internal.operators.single.o(lul0.c(tfxVar), new be50(new ysl0(storyEntry, i, this), 16));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.a c(List<? extends StoryEntry> list) {
        List<? extends StoryEntry> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((StoryEntry) it.next()).Gb());
        }
        this.c.a.getClass();
        tfx tfxVar = new tfx("stories.delete", new uf3(28), new igj0(3));
        tfxVar.i("stories", arrayList);
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.Z(yfb.x(tfxVar)).e(this.f.b(null, false)), new ox80(new defpackage.v(22, list, this), 10)));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.a d(UserId userId) {
        avl0 avl0Var = this.c.a;
        List singletonList = Collections.singletonList(userId);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.unbanOwner", new r11(28), new sf3(26));
        tfx.p(tfxVar, "owners_ids", singletonList, 0L, 12);
        return new io.reactivex.rxjava3.internal.operators.completable.p(rsg0.Z(yfb.x(tfxVar)).e(this.f.b(null, false)));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.x<Boolean> e(StoryEntry storyEntry) {
        avl0 avl0Var = this.c.a;
        UserId userId = storyEntry.d;
        Integer valueOf = Integer.valueOf(storyEntry.c);
        String str = storyEntry.u;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.markNotInterested", new zy60(12), new vga0(6));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "story_id", valueOf.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
            tfxVar = tfxVar;
        }
        return lul0.c(tfxVar);
    }

    @Override // xsna.xsl0
    public final boolean f(StoriesContainer storiesContainer) {
        if (storiesContainer.Qb()) {
            return true;
        }
        storiesContainer.g.isEmpty();
        return true;
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.a g(final StoryEntry storyEntry, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        int i = 27;
        return p(storyEntry, false, null, rsg0.Z(yfb.x(k0x.e(this.c.b, "story", storyEntry.c, storyEntry.d, storyEntry.o, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), storyEntry.u, PsExtractor.AUDIO_STREAM)))).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.atl0
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                ctl0.this.b.e(125, storyEntry);
            }
        }).i(new c120(new cq3(i, this, storyEntry), i));
    }

    @Override // xsna.xsl0
    public final bfj h(ArrayList arrayList, StoriesContainer storiesContainer, StoriesContainer storiesContainer2) {
        GetStoriesResponse i;
        StoryIdeasBlock storyIdeasBlock;
        Integer num;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        StoriesFeatures storiesFeatures = StoriesFeatures.IDEAS_STORY_VIEWER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures) && (i = this.d.i()) != null && (storyIdeasBlock = i.g) != null && (num = storyIdeasBlock.d) != null) {
            int intValue = num.intValue();
            List<StoryIdea> list = storyIdeasBlock.b;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            List<StoryIdea> list2 = list;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : list2) {
                if (((StoryIdea) obj).e > currentTimeMillis) {
                    arrayList4.add(obj);
                }
            }
            int indexOf = arrayList.indexOf(storiesContainer);
            Integer valueOf = Integer.valueOf(indexOf);
            if (indexOf < 0) {
                valueOf = null;
            }
            int intValue2 = (valueOf != null ? valueOf.intValue() : 0) + intValue;
            if (!arrayList4.isEmpty() && intValue2 >= 0 && intValue2 <= arrayList.size()) {
                ArrayList arrayList5 = new ArrayList(arrayList.size() + 1);
                arrayList5.addAll(arrayList);
                String str2 = storyIdeasBlock.c;
                if (drm0.N(str2)) {
                    str2 = null;
                }
                String str3 = storyIdeasBlock.e;
                if (str3 == null || drm0.N(str3)) {
                    arrayList2 = arrayList5;
                    str = null;
                } else {
                    str = str3;
                    arrayList2 = arrayList5;
                }
                arrayList2.add(intValue2, new IdeasStoriesContainer(arrayList4, num, str2, str, null, null, false, false, null, 496, null));
                arrayList3 = arrayList2;
                return new bfj(arrayList3, storiesContainer2.Ob());
            }
        }
        arrayList3 = arrayList;
        return new bfj(arrayList3, storiesContainer2.Ob());
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.x<u4m0> i(String str, boolean z) {
        avl0 avl0Var = this.c.a;
        Boolean valueOf = Boolean.valueOf(z);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.getTopHashtags", new caf0(2), new ck70(11));
        tfx.o(tfxVar, "prefix", str, 0, 0, 12);
        tfxVar.j("remove_sharps", valueOf.booleanValue());
        return rsg0.w0(yfb.x(tfxVar)).l(new wx40(new wfl0(1), 9));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.disposables.c j(as80 as80Var) {
        io.reactivex.rxjava3.core.x k;
        JSONObject g;
        eqy<bek0> eqyVar = com.vk.toggle.d.a;
        b.d i = com.vk.toggle.b.A.i(StoriesFeatures.ST_VIDEO_PRELOADER_PART);
        long optInt = (i == null || (g = i.g()) == null) ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : g.optInt("load_duration_ms");
        StoryEntry Lb = as80Var.a.Lb();
        if (Lb != null) {
            aql0 aql0Var = (aql0) this.h.getValue();
            int i2 = a.b;
            k = aql0Var.a(Lb).r(optInt, TimeUnit.MILLISECONDS).q(asu0.a.c());
        } else {
            k = io.reactivex.rxjava3.core.x.k(Boolean.FALSE);
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(k.m(asu0.a.d()), new kgj0(2), null).subscribe(new ksb0(new mu1(29, as80Var, this), 8), new t520(new qm90(11, as80Var, this), 21));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.a k(StoryEntry storyEntry, Integer num, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        return p(storyEntry, true, num, rsg0.Z(yfb.x(k0x.d(this.c.b, "story", storyEntry.c, storyEntry.d, num, storyEntry.o, com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), storyEntry.u, null, 896)))).g(new fmz(this, storyEntry, 1)).i(new dh40(new btl0(0, this, storyEntry), 18));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.x l(UserId userId, String str, boolean z) {
        avl0 avl0Var = this.c.a;
        return lul0.c(z ? avl0Var.g(userId, str) : avl0Var.a(userId));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.disposables.c m(as80 as80Var) {
        return ((fnm0) this.g.getValue()).a(as80Var.a).m(asu0.a.d()).subscribe(new m3y(new kpk0(3, this, as80Var), 20), new f2u(new lh(27, as80Var, this), 21));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.a n(UserId userId, StoriesContainer storiesContainer, String str) {
        avl0 avl0Var = this.c.a;
        List singletonList = Collections.singletonList(userId);
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.banOwner", new eq0(28), new gsi0(2));
        tfx.p(tfxVar, "owners_ids", singletonList, 0L, 12);
        if (str != null) {
            tfx.o(tfxVar, "track_code", str, 0, 0, 12);
        }
        return new io.reactivex.rxjava3.internal.operators.completable.p(new io.reactivex.rxjava3.internal.operators.single.o(rsg0.Z(yfb.x(tfxVar)).e(this.f.b(null, false)), new n240(new zsl0(0, this, storiesContainer), 16)));
    }

    @Override // xsna.xsl0
    public final io.reactivex.rxjava3.core.x<Boolean> o(StoryEntry storyEntry) {
        avl0 avl0Var = this.c.a;
        UserId userId = storyEntry.d;
        int i = storyEntry.c;
        avl0Var.getClass();
        tfx tfxVar = new tfx("stories.hideReply", new bz60(11), new oyh0(4));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        return new io.reactivex.rxjava3.internal.operators.single.o(lul0.c(tfxVar), new d750(new r5i0(1, this, storyEntry), 16));
    }

    public final io.reactivex.rxjava3.internal.operators.completable.w p(StoryEntry storyEntry, boolean z, Integer num, io.reactivex.rxjava3.core.a aVar) {
        boolean z2 = storyEntry.c0;
        Integer num2 = storyEntry.g0;
        storyEntry.c0 = z;
        storyEntry.g0 = num;
        return aVar.g(new i55(1, storyEntry, this, num)).i(new pmu(new hdw(storyEntry, z2, num2), 19));
    }
}
