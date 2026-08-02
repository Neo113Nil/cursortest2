package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.clips.viewer.impl.domain.filters.TopClipsFilter;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ChallengeStyle;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.lgj0;

/* compiled from: ClipsGridCommonClipsDelegate.kt */
/* loaded from: classes17.dex */
public final class mce implements sde {
    public static final /* synthetic */ qcy<Object>[] j;
    public static final List<String> k;
    public static final List<String> l;
    public ClipGridParams a;
    public final ngj0 b;
    public AbstractClipsGridListFragment f;
    public ClipCameraParams h;
    public final String c = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID);
    public final alk d = new alk();
    public PaginationKey e = PaginationKey.Initial.b;
    public List<? extends nmv> g = EmptyList.b;
    public final pgn i = new pgn();

    /* compiled from: ClipsGridCommonClipsDelegate.kt */
    public static final class a implements c9l {
        public final ClipVideoFile b;

        public a(ClipVideoFile clipVideoFile) {
            this.b = clipVideoFile;
        }

        @Override // xsna.c9l
        public final String b1() {
            return this.b.a1();
        }
    }

    /* compiled from: ClipsGridCommonClipsDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            mce mceVar = (mce) this.receiver;
            qcy<Object>[] qcyVarArr = mce.j;
            mceVar.getClass();
            L.i(th);
            AbstractClipsGridListFragment abstractClipsGridListFragment = mceVar.f;
            if (abstractClipsGridListFragment != null) {
                abstractClipsGridListFragment.g0();
            }
            return s3q0.a;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(mce.class, "paginationDisposable", "getPaginationDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        j = new qcy[]{mutablePropertyReference1Impl};
        k = e43.l("is_clips_notifications_ignored", "verified", "member_status", "friend_status", "first_name_gen", "image_status", "photo_base", "url", "trust_mark");
        l = e43.l("verified", "image_status", "photo_base", "url", "trust_mark", GroupsFieldsDto.VIDEO_LIVES_DATA.k());
    }

    public mce(ClipGridParams clipGridParams, ngj0 ngj0Var) {
        this.a = clipGridParams;
        this.b = ngj0Var;
    }

    @Override // xsna.sde
    public final void a() {
        d();
    }

    public final io.reactivex.rxjava3.internal.operators.single.y b(ClipGridParams.Data.Profile profile) {
        dz2 x = yfb.x(lgj0.a.g(this.b, profile.b.b.b, 12, this.e.zb(), k, null, null, null, null, null, null, 65520));
        ahn.D(x);
        return rsg0.w0(x).l(new o7(new gt(11), 11));
    }

    @Override // xsna.sde
    public final boolean c() {
        ClipsAuthor clipsAuthor;
        ClipGridParams clipGridParams = this.a;
        ClipGridParams.Data.Profile profile = clipGridParams instanceof ClipGridParams.Data.Profile ? (ClipGridParams.Data.Profile) clipGridParams : null;
        if (profile == null || (clipsAuthor = profile.b) == null) {
            return false;
        }
        if (clipsAuthor.b.p) {
            return true;
        }
        if (clipsAuthor.g == 0 || !ehd.b(clipsAuthor) || clipsAuthor.f == 3) {
            return (ehd.c(clipsAuthor) || ehd.e(clipsAuthor)) && !ehd.d(clipsAuthor);
        }
        return true;
    }

    @Override // xsna.sde
    public final void d() {
        qcy<Object>[] qcyVarArr = j;
        qcy<Object> qcyVar = qcyVarArr[0];
        pgn pgnVar = this.i;
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if ((cVar != null && hg1.d(cVar)) || (this.e instanceof PaginationKey.LoadedFull) || c()) {
            return;
        }
        ClipGridParams clipGridParams = this.a;
        AbstractClipsGridListFragment abstractClipsGridListFragment = this.f;
        if (abstractClipsGridListFragment != null) {
            abstractClipsGridListFragment.lb();
        }
        io.reactivex.rxjava3.disposables.c subscribe = (clipGridParams instanceof ClipGridParams.Data.Profile ? b((ClipGridParams.Data.Profile) clipGridParams) : i(clipGridParams)).m(asu0.a.d()).subscribe(new np3(new sa(this, 28), 9), new y50(new b(1, this, mce.class, "processError", "processError(Ljava/lang/Throwable;)V", 0), 15));
        qcy<Object> qcyVar2 = qcyVarArr[0];
        pgnVar.b(subscribe);
    }

    @Override // xsna.sde
    public final void e(AbstractClipsGridListFragment abstractClipsGridListFragment) {
        this.f = abstractClipsGridListFragment;
        if (!this.g.isEmpty()) {
            abstractClipsGridListFragment.po(this.g, true);
            return;
        }
        qcy<Object> qcyVar = j[0];
        if (hg1.d((io.reactivex.rxjava3.disposables.c) this.i.b)) {
            abstractClipsGridListFragment.lb();
        } else {
            abstractClipsGridListFragment.po(EmptyList.b, true);
        }
    }

    @Override // xsna.sde
    public final ClipGridParams f() {
        return this.a;
    }

    @Override // xsna.sde
    public final void g() {
        this.f = null;
    }

    @Override // xsna.sde
    public final PaginationKey h() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.reactivex.rxjava3.internal.operators.single.y i(ClipGridParams clipGridParams) {
        ClipGridParams.OnlyId zb;
        TopClipsFilter placeFilter;
        if (clipGridParams instanceof ClipGridParams.Data.Music) {
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) clipGridParams;
            if (music.b.l) {
                zb = new ClipGridParams.OnlyId.Audio(music.f);
                if (!(zb instanceof ClipGridParams.OnlyId.Audio)) {
                    placeFilter = new TopClipsFilter.AudioIdFilter(((ClipGridParams.OnlyId.Audio) zb).b);
                } else if (zb instanceof ClipGridParams.OnlyId.Hashtag) {
                    placeFilter = new TopClipsFilter.HashtagFilter(((ClipGridParams.OnlyId.Hashtag) zb).b);
                } else if (zb instanceof ClipGridParams.OnlyId.CameraMask) {
                    placeFilter = new TopClipsFilter.MaskFilter(((ClipGridParams.OnlyId.CameraMask) zb).b);
                } else if (zb instanceof ClipGridParams.OnlyId.ClipCompilation) {
                    placeFilter = new TopClipsFilter.CompilationFilter(String.valueOf(((ClipGridParams.OnlyId.ClipCompilation) zb).b));
                } else {
                    if (!(zb instanceof ClipGridParams.OnlyId.GeoPlace)) {
                        if (zb instanceof ClipGridParams.OnlyId.Profile) {
                            throw new IllegalArgumentException("There is no filter for profile, consider use getOwnerVideos");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    placeFilter = new TopClipsFilter.PlaceFilter(String.valueOf(((ClipGridParams.OnlyId.GeoPlace) zb).b));
                }
                String d = placeFilter.d();
                dz2 x = yfb.x(lgj0.a.l(this.b, 12, this.e.zb(), d, null, this.c, null, l, null, null, null, null, null, 524200));
                ahn.D(x);
                return rsg0.w0(x).l(new p7(new qm0(11), 16));
            }
        }
        zb = clipGridParams.zb();
        if (!(zb instanceof ClipGridParams.OnlyId.Audio)) {
        }
        String d2 = placeFilter.d();
        dz2 x2 = yfb.x(lgj0.a.l(this.b, 12, this.e.zb(), d2, null, this.c, null, l, null, null, null, null, null, 524200));
        ahn.D(x2);
        return rsg0.w0(x2).l(new p7(new qm0(11), 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ClipGridParams.Data data, jpe jpeVar, ild ildVar, boolean z) {
        boolean z2;
        int intValue;
        Integer num;
        ClipsChallenge clipsChallenge;
        ClipsChallenge clipsChallenge2;
        ClipsChallenge clipsChallenge3;
        ChallengeStyle challengeStyle;
        ClipsChallenge clipsChallenge4;
        ClipsChallenge clipsChallenge5;
        int i;
        ClipsChallenge clipsChallenge6;
        PaginationKey paginationKey = jpeVar.b;
        ArrayList arrayList = jpeVar.a;
        this.e = paginationKey;
        List<String> list = null;
        if (data != null) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            boolean z3 = data instanceof ClipGridParams.Data.Music;
            if (z3) {
                MusicTrack musicTrack = ((ClipGridParams.Data.Music) data).b;
                if (musicTrack.F) {
                    arrayList2.add(new ClipsGridHeaderEntry.a(musicTrack));
                }
            } else if (data instanceof ClipGridParams.Data.CameraMask) {
                Mask mask = ((ClipGridParams.Data.CameraMask) data).b;
                ClipsGridHeaderEntry.Author a2 = ClipsGridHeaderEntry.Author.a.a(mask.b, mask.c, mask.u ? ClipsGridHeaderEntry.Author.ContentType.EFFECT : ClipsGridHeaderEntry.Author.ContentType.MASK);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            } else if (data instanceof ClipGridParams.Data.Profile) {
                arrayList2.add(new ClipsGridHeaderEntry.b(((ClipGridParams.Data.Profile) data).b.b.b));
            }
            if (z && (clipsChallenge6 = ildVar.a) != null) {
                ClipCameraParams clipCameraParams = clipsChallenge6.d;
                this.h = clipCameraParams;
                if (!z3) {
                    boolean z4 = data instanceof ClipGridParams.Data.ClipCompilation;
                    if (!(data instanceof ClipGridParams.Data.Hashtag) || !((ClipGridParams.Data.Hashtag) data).d) {
                        ClipsGridHeaderEntry.Author a3 = ClipsGridHeaderEntry.Author.a.a(clipsChallenge6.h, clipsChallenge6.i, z4 ? ClipsGridHeaderEntry.Author.ContentType.COMPILATION : ClipsGridHeaderEntry.Author.ContentType.CHALLENGE);
                        if (a3 != null) {
                            arrayList2.add(a3);
                        }
                    }
                }
                boolean z5 = data instanceof ClipGridParams.Data.Hashtag;
                ClipGridParams.Data.Hashtag hashtag = z5 ? (ClipGridParams.Data.Hashtag) data : null;
                if (hashtag == null || !hashtag.d) {
                    arrayList2.add(new gce(clipsChallenge6, data, this.h));
                }
                MusicTrack musicTrack2 = clipCameraParams != null ? clipCameraParams.d : null;
                if (musicTrack2 != null && z5 && ((ClipGridParams.Data.Hashtag) data).d) {
                    arrayList2.add(new ClipsGridHeaderEntry.a(musicTrack2));
                }
            }
            if (arrayList2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = arrayList2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if ((((nmv) it.next()) instanceof ClipsGridHeaderEntry.Author) && (i = i + 1) < 0) {
                        e43.s();
                        throw null;
                    }
                }
            }
            if (i > 1) {
                ClipGridParams clipGridParams = this.a;
                if ((clipGridParams instanceof ClipGridParams.OnlyId.Hashtag) || (clipGridParams instanceof ClipGridParams.Data.Hashtag)) {
                    g5g.D(arrayList2, true, new jt(15));
                } else if ((clipGridParams instanceof ClipGridParams.OnlyId.CameraMask) || (clipGridParams instanceof ClipGridParams.Data.CameraMask)) {
                    g5g.D(arrayList2, true, new sm0(7));
                } else if ((clipGridParams instanceof ClipGridParams.OnlyId.ClipCompilation) || (clipGridParams instanceof ClipGridParams.Data.ClipCompilation)) {
                    g5g.D(arrayList2, true, new e60(13));
                }
            }
            this.g = j5g.u0(arrayList2, this.g);
        }
        PaginationKey paginationKey2 = jpeVar.b;
        ArrayList<nmv> arrayList3 = new ArrayList<>(arrayList.size());
        if (arrayList.isEmpty()) {
            List<ClipVideoFile> list2 = (ildVar == null || (clipsChallenge5 = ildVar.a) == null) ? null : clipsChallenge5.f;
            if (list2 == null || list2.isEmpty()) {
                z2 = true;
                if (!z2 && (paginationKey2 instanceof PaginationKey.LoadedFull)) {
                    k(arrayList3);
                    return;
                }
                if (!z2) {
                    d();
                    return;
                }
                List<? extends nmv> list3 = this.g;
                ArrayList arrayList4 = new ArrayList();
                for (nmv nmvVar : list3) {
                    a aVar = nmvVar instanceof vee ? new a(((vee) nmvVar).a) : null;
                    if (aVar != null) {
                        arrayList4.add(aVar);
                    }
                }
                List<ClipVideoFile> list4 = (ildVar == null || (clipsChallenge4 = ildVar.a) == null) ? null : clipsChallenge4.f;
                if (list4 == null) {
                    list4 = EmptyList.b;
                }
                ArrayList u0 = j5g.u0(arrayList, list4);
                ArrayList arrayList5 = new ArrayList(c5g.u(u0, 10));
                Iterator it2 = u0.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(new a((ClipVideoFile) it2.next()));
                }
                this.d.getClass();
                ArrayList arrayList6 = alk.o(arrayList4, arrayList5).a;
                if (arrayList6.isEmpty() && (paginationKey2 instanceof PaginationKey.LoadedFull)) {
                    k(arrayList3);
                    return;
                }
                if (arrayList6.isEmpty()) {
                    d();
                    return;
                }
                ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList7.add(((a) it3.next()).b);
                }
                ClipGridParams clipGridParams2 = this.a;
                if (z) {
                    intValue = 0;
                } else {
                    Object k0 = j5g.k0(this.g);
                    vee veeVar = k0 instanceof vee ? (vee) k0 : null;
                    intValue = ((veeVar == null || (num = veeVar.b) == null) ? -1 : num.intValue()) + 1;
                }
                boolean z6 = (clipGridParams2 instanceof ClipGridParams.Data.Profile) || (clipGridParams2 instanceof ClipGridParams.OnlyId.Profile);
                boolean z7 = (z6 && (ildVar == null || (clipsChallenge3 = ildVar.a) == null || (challengeStyle = clipsChallenge3.m) == null || !challengeStyle.c)) ? false : true;
                HashMap hashMap = new HashMap();
                List<ClipVideoFile> list5 = (ildVar == null || (clipsChallenge2 = ildVar.a) == null) ? null : clipsChallenge2.f;
                if (ildVar != null && (clipsChallenge = ildVar.a) != null) {
                    list = clipsChallenge.g;
                }
                if (list5 != null && list != null) {
                    int size = list5.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = (String) j5g.b0(i2, list);
                        if (str != null) {
                            hashMap.put(list5.get(i2), str);
                        }
                    }
                }
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    ClipVideoFile clipVideoFile = (ClipVideoFile) it4.next();
                    arrayList3.add(new vee(clipVideoFile, Integer.valueOf(intValue), (clipGridParams2 instanceof ClipGridParams.Data.Music) && epx.f(((ClipGridParams.Data.Music) clipGridParams2).b.K, clipVideoFile.a1()), (String) hashMap.get(clipVideoFile), !z6, z7));
                    intValue++;
                }
                ArrayList u02 = j5g.u0(arrayList3, this.g);
                this.g = u02;
                AbstractClipsGridListFragment abstractClipsGridListFragment = this.f;
                if (abstractClipsGridListFragment != null) {
                    abstractClipsGridListFragment.po(u02, true);
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (!z2) {
        }
        if (!z2) {
        }
    }

    public final void k(ArrayList<nmv> arrayList) {
        ClipGridParams clipGridParams = this.a;
        if (((clipGridParams instanceof ClipGridParams.Data.Profile) && !((ClipGridParams.Data.Profile) clipGridParams).b.c.isEmpty()) || c()) {
            this.g = EmptyList.b;
        } else if (!arrayList.isEmpty()) {
            this.g = arrayList;
        }
        AbstractClipsGridListFragment abstractClipsGridListFragment = this.f;
        if (abstractClipsGridListFragment != null) {
            abstractClipsGridListFragment.po(this.g, true);
        }
    }
}
