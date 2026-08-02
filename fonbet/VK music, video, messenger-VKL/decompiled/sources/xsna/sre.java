package xsna;

import com.vk.clips.playlists.playlist_ui.model.ClipsPlaylistUiLoadingState;
import com.vk.clips.playlists.playlist_ui.model.OverlayViewState;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.rre;
import xsna.tre;
import xsna.vre;

/* compiled from: ClipsPlaylistUiReducer.kt */
/* loaded from: classes16.dex */
public final class sre extends dm50<yre, rre, vre> {
    public final bpn0 d;

    public sre() {
        super(new vre.c(0, null, UserId.d, "", null));
        this.d = new bpn0(new pr1(8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.tre$a] */
    @Override // xsna.dm50
    public final vre c(vre vreVar, rre rreVar) {
        Integer valueOf;
        Integer num;
        vre vreVar2 = vreVar;
        rre rreVar2 = rreVar;
        if (rreVar2 instanceof rre.g) {
            rre.g gVar = (rre.g) rreVar2;
            String str = gVar.b;
            String str2 = (str == null && (str = vreVar2.getTitle()) == null) ? "" : str;
            Integer num2 = gVar.c;
            if (num2 == null) {
                num2 = vreVar2.getCount();
            }
            Integer num3 = num2;
            Integer num4 = gVar.d;
            return new vre.c(num4 != null ? num4.intValue() : vreVar2.i().intValue(), num3, gVar.f, str2, gVar.e);
        }
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState = null;
        r5 = null;
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState2 = null;
        if (rreVar2 instanceof rre.h) {
            if (!(vreVar2 instanceof vre.b)) {
                return vreVar2;
            }
            vre.b bVar = (vre.b) vreVar2;
            ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState3 = bVar.o;
            if (((rre.h) rreVar2).b) {
                int h = clipsPlaylistUiLoadingState3.h() | ClipsPlaylistUiLoadingState.TopLoading.h();
                ClipsPlaylistUiLoadingState[] values = ClipsPlaylistUiLoadingState.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState4 = values[i];
                    if (clipsPlaylistUiLoadingState4.h() == h) {
                        clipsPlaylistUiLoadingState2 = clipsPlaylistUiLoadingState4;
                        break;
                    }
                    i++;
                }
                if (clipsPlaylistUiLoadingState2 == null) {
                    clipsPlaylistUiLoadingState2 = ClipsPlaylistUiLoadingState.None;
                }
            } else {
                int h2 = clipsPlaylistUiLoadingState3.h() | ClipsPlaylistUiLoadingState.BottomLoading.h();
                ClipsPlaylistUiLoadingState[] values2 = ClipsPlaylistUiLoadingState.values();
                int length2 = values2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState5 = values2[i2];
                    if (clipsPlaylistUiLoadingState5.h() == h2) {
                        clipsPlaylistUiLoadingState2 = clipsPlaylistUiLoadingState5;
                        break;
                    }
                    i2++;
                }
                if (clipsPlaylistUiLoadingState2 == null) {
                    clipsPlaylistUiLoadingState2 = ClipsPlaylistUiLoadingState.None;
                }
            }
            return vre.b.a(bVar, null, null, false, null, null, clipsPlaylistUiLoadingState2, null, null, 15871);
        }
        if (rreVar2 instanceof rre.e) {
            String title = vreVar2.getTitle();
            String str3 = title == null ? "" : title;
            Integer count = vreVar2.getCount();
            int intValue = vreVar2.i().intValue();
            UserId q = vreVar2.q();
            vre.c cVar = vreVar2 instanceof vre.c ? (vre.c) vreVar2 : null;
            return new vre.a(str3, count, intValue, q, cVar != null ? cVar.i : null, ((rre.e) rreVar2).b);
        }
        boolean z = rreVar2 instanceof rre.f;
        tre.b bVar2 = tre.b.a;
        if (z) {
            rre.f fVar = (rre.f) rreVar2;
            if (!(vreVar2 instanceof vre.d)) {
                return vreVar2;
            }
            if (vreVar2 instanceof vre.b) {
                return vreVar2;
            }
            if (!(vreVar2 instanceof vre.a) && !(vreVar2 instanceof vre.c)) {
                throw new NoWhenBranchMatchedException();
            }
            List<VideoFile> list = fVar.b;
            String str4 = fVar.c;
            String str5 = fVar.d;
            String title2 = ((vre.d) vreVar2).getTitle();
            String str6 = title2 == null ? "" : title2;
            Integer num5 = fVar.e;
            if (num5 == null) {
                num5 = ((vre.d) vreVar2).getCount();
            }
            Integer num6 = num5;
            int intValue2 = ((vre.d) vreVar2).i().intValue();
            OverlayViewState overlayViewState = OverlayViewState.Gone;
            vre.c cVar2 = vreVar2 instanceof vre.c ? (vre.c) vreVar2 : null;
            return new vre.b(list, str4, str6, num6, intValue2, false, overlayViewState, str5, cVar2 != null ? cVar2.i : null, ClipsPlaylistUiLoadingState.None, fVar.g, ((vre.d) vreVar2).q(), bVar2, fVar.f);
        }
        if (!(rreVar2 instanceof rre.a)) {
            if (rreVar2 instanceof rre.k) {
                return vreVar2 instanceof vre.b ? vre.b.a((vre.b) vreVar2, null, null, true, null, null, null, null, null, 16351) : vreVar2;
            }
            if (rreVar2 instanceof rre.c) {
                return vreVar2 instanceof vre.b ? vre.b.a((vre.b) vreVar2, null, null, false, null, null, null, null, null, 16351) : vreVar2;
            }
            if (rreVar2 instanceof rre.j) {
                return vreVar2 instanceof vre.b ? vre.b.a((vre.b) vreVar2, null, null, false, OverlayViewState.DeletionDialog, null, null, null, null, 16319) : vreVar2;
            }
            if (rreVar2 instanceof rre.b) {
                return vreVar2 instanceof vre.b ? vre.b.a((vre.b) vreVar2, null, null, false, OverlayViewState.Gone, null, null, null, null, 16319) : vreVar2;
            }
            if (rreVar2 instanceof rre.i) {
                if (!(vreVar2 instanceof vre.b)) {
                    return vreVar2;
                }
                vre.b bVar3 = (vre.b) vreVar2;
                return vre.b.a(bVar3, null, null, false, null, null, null, ((rre.i) rreVar2).b ? new tre.a(i7o0.a(bVar3.f)) : bVar2, null, 12287);
            }
            if (!(rreVar2 instanceof rre.d)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(vreVar2 instanceof vre.b)) {
                return vreVar2;
            }
            vre.b bVar4 = (vre.b) vreVar2;
            List g = rdi.g(bVar4.f);
            rre.d dVar = (rre.d) rreVar2;
            g.add(dVar.c, g.remove(dVar.b));
            return vre.b.a(bVar4, g, null, false, null, null, null, null, null, 16382);
        }
        rre.a aVar = (rre.a) rreVar2;
        if (!(vreVar2 instanceof vre.d)) {
            return vreVar2;
        }
        if (!(vreVar2 instanceof vre.b)) {
            if (!(vreVar2 instanceof vre.a) && !(vreVar2 instanceof vre.c)) {
                throw new NoWhenBranchMatchedException();
            }
            fp.d("New batches can be loaded only from loaded state");
            return vreVar2;
        }
        boolean z2 = aVar.b;
        List<VideoFile> list2 = aVar.c;
        if (z2) {
            Integer num7 = ((vre.b) vreVar2).s;
            int size = list2.size();
            if (num7 != null) {
                valueOf = Integer.valueOf(num7.intValue() - size);
            }
            valueOf = null;
        } else {
            Integer num8 = aVar.f;
            int size2 = ((vre.b) vreVar2).f.size();
            if (num8 != null) {
                valueOf = Integer.valueOf(num8.intValue() - size2);
            }
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue3 = valueOf.intValue();
            if (intValue3 < 0) {
                intValue3 = 0;
            }
            num = Integer.valueOf(intValue3);
        } else {
            num = null;
        }
        ArrayList u0 = z2 ? j5g.u0(((vre.b) vreVar2).f, list2) : j5g.u0(list2, ((vre.b) vreVar2).f);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : u0) {
            if (hashSet.add(((VideoFile) obj).a1())) {
                arrayList.add(obj);
            }
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"PlaylistsUi | PAGING CURRENT LIST " + j5g.g0(arrayList, null, null, null, 0, new d40(13), 31)});
        }
        vre.b bVar5 = (vre.b) vreVar2;
        tre treVar = bVar5.r;
        if (!(treVar instanceof tre.b)) {
            if (!(treVar instanceof tre.a)) {
                throw new NoWhenBranchMatchedException();
            }
            tre.a aVar2 = (tre.a) treVar;
            ArrayList u02 = z2 ? j5g.u0(aVar2.a, list2) : j5g.u0(list2, aVar2.a);
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : u02) {
                if (hashSet2.add(((VideoFile) obj2).a1())) {
                    arrayList2.add(obj2);
                }
            }
            L l2 = L.a;
            l2.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l2, L.LogType.d, new Object[]{"PlaylistsUi | PAGING LAST LIST " + j5g.g0(arrayList2, null, null, null, 0, new ur0(10), 31)});
            }
            aVar2.getClass();
            treVar = new tre.a(arrayList2);
        }
        tre treVar2 = treVar;
        String str7 = !z2 ? aVar.d : bVar5.g;
        String str8 = z2 ? aVar.e : bVar5.m;
        int h3 = bVar5.o.h() & (~(z2 ? ClipsPlaylistUiLoadingState.TopLoading : ClipsPlaylistUiLoadingState.BottomLoading).h());
        ClipsPlaylistUiLoadingState[] values3 = ClipsPlaylistUiLoadingState.values();
        int length3 = values3.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState6 = values3[i3];
            if (clipsPlaylistUiLoadingState6.h() == h3) {
                clipsPlaylistUiLoadingState = clipsPlaylistUiLoadingState6;
                break;
            }
            i3++;
        }
        if (clipsPlaylistUiLoadingState == null) {
            clipsPlaylistUiLoadingState = ClipsPlaylistUiLoadingState.None;
        }
        ClipsPlaylistUiLoadingState clipsPlaylistUiLoadingState7 = clipsPlaylistUiLoadingState;
        Integer num9 = bVar5.s;
        return vre.b.a(bVar5, arrayList, str7, false, null, str8, clipsPlaylistUiLoadingState7, treVar2, Integer.valueOf(Math.min(num9 != null ? num9.intValue() : Integer.MAX_VALUE, num != null ? num.intValue() : Integer.MAX_VALUE)), 3196);
    }

    @Override // xsna.dm50
    public final yre d() {
        return new yre(e(new iz0(this, 14)), e(new j5(this, 27)), e(new lz0(this, 21)), e(new com.vk.movika.sdk.base.observable.e0(14)));
    }

    @Override // xsna.dm50
    public final void h(vre vreVar, yre yreVar) {
        vre vreVar2 = vreVar;
        yre yreVar2 = yreVar;
        if (vreVar2 instanceof vre.a) {
            f(yreVar2.b, vreVar2);
        } else if (vreVar2 instanceof vre.b) {
            f(yreVar2.c, vreVar2);
        } else if (vreVar2 instanceof vre.c) {
            f(yreVar2.a, vreVar2);
        }
    }
}
