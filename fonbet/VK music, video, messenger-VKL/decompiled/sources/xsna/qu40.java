package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.domain.model.SnippetOnboardingState;
import com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.fu40;

/* compiled from: MusicPickerReducer.kt */
/* loaded from: classes4.dex */
public final class qu40 extends dm50<xu40, fu40, MusicPickerState> {
    public final com.vk.newsfeed.posting.music_picker.presentation.model.a d;
    public final wu40 e;
    public final me50 f;

    /* compiled from: MusicPickerReducer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SnippetOnboardingState.values().length];
            try {
                iArr[SnippetOnboardingState.PENDING_TOOLTIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qu40(com.vk.newsfeed.posting.music_picker.presentation.model.a aVar, MusicPickerState musicPickerState, wu40 wu40Var) {
        super(musicPickerState);
        this.d = aVar;
        this.e = wu40Var;
        this.f = new me50();
    }

    public static MusicPickerList i(MusicPickerList musicPickerList, String str, boolean z) {
        return musicPickerList instanceof MusicPickerList.Tracks ? MusicPickerList.Tracks.a((MusicPickerList.Tracks) musicPickerList, str, null, null, 0, 0, z, 61) : musicPickerList instanceof MusicPickerList.Playlists ? MusicPickerList.Playlists.a((MusicPickerList.Playlists) musicPickerList, str, null, null, 0, 0, z, 61) : musicPickerList;
    }

    public static MusicPickerState j(MusicPickerState musicPickerState, MusicPickerList musicPickerList, MusicPickerLoadingState musicPickerLoadingState) {
        List<MusicPickerList> list = musicPickerState.j;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (MusicPickerList musicPickerList2 : list) {
            if (epx.f(musicPickerList2.Y0(), musicPickerList.Y0())) {
                if (musicPickerList instanceof MusicPickerList.Tracks) {
                    musicPickerList2 = MusicPickerList.Tracks.a((MusicPickerList.Tracks) musicPickerList, null, null, musicPickerLoadingState, 0, 0, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                } else if (musicPickerList instanceof MusicPickerList.SelectedPlaylist) {
                    musicPickerList2 = MusicPickerList.SelectedPlaylist.a((MusicPickerList.SelectedPlaylist) musicPickerList, null, musicPickerLoadingState, 0, 0, 55);
                } else {
                    if (!(musicPickerList instanceof MusicPickerList.Playlists)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    musicPickerList2 = MusicPickerList.Playlists.a((MusicPickerList.Playlists) musicPickerList, null, null, musicPickerLoadingState, 0, 0, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
                }
            }
            arrayList.add(musicPickerList2);
        }
        return MusicPickerState.a(musicPickerState, null, null, null, arrayList, null, null, false, false, null, 32511);
    }

    public static MusicPickerState k(MusicPickerState musicPickerState, List list, MusicDto musicDto) {
        return MusicPickerState.a(musicPickerState, null, list, musicDto, null, null, null, false, false, null, 32719);
    }

    public static boolean l(MusicPickerList musicPickerList) {
        if (musicPickerList instanceof MusicPickerList.Tracks) {
            return ((MusicPickerList.Tracks) musicPickerList).h;
        }
        if (musicPickerList instanceof MusicPickerList.Playlists) {
            return ((MusicPickerList.Playlists) musicPickerList).h;
        }
        return false;
    }

    public static List m(ArrayList arrayList, List list) {
        final lq2 lq2Var = new lq2(6);
        TreeSet treeSet = new TreeSet(new Comparator() { // from class: xsna.nu40
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) lq2.this.invoke(obj, obj2)).intValue();
            }
        });
        treeSet.addAll(list);
        treeSet.addAll(arrayList);
        return j5g.O0(treeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0193, code lost:
    
        r6 = ((com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists) r2).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01de, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01d5, code lost:
    
        r3.set(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ee, code lost:
    
        return com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState.a(r0, null, null, null, r3, null, null, false, false, null, 32511);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (r5 != (-1)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
    
        r9 = java.lang.Integer.valueOf(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        if (r9 == null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0163, code lost:
    
        r4 = (com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList) r3.get(r9.intValue());
        r5 = r9.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0173, code lost:
    
        if ((r4 instanceof com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Tracks) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        if ((r4 instanceof com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.SelectedPlaylist) == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017d, code lost:
    
        if ((r4 instanceof com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        r9 = (com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists) r4;
        r4 = r9.c;
        r1 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
    
        if ((r2 instanceof com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Tracks) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018a, code lost:
    
        r6 = ((com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Tracks) r2).c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019b, code lost:
    
        if (xsna.epx.f(r4, r6) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        r2 = r1.a;
        r4 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a1, code lost:
    
        if (r2 != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c4, code lost:
    
        r4 = com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists.a(r9, null, r4, com.vk.newsfeed.posting.music_picker.presentation.view.MusicPickerLoadingState.Loaded, r1.b, r1.c, false, 67);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a5, code lost:
    
        r2 = r9.d;
        r7 = new xsna.nq2((byte) 0, 6);
        r6 = new java.util.TreeSet(new xsna.ou40(r7));
        r6.addAll(r2);
        r6.addAll(r4);
        r4 = xsna.j5g.O0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d4, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0191, code lost:
    
        if ((r2 instanceof com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList.Playlists) == false) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.util.List] */
    @Override // xsna.dm50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MusicPickerState c(MusicPickerState musicPickerState, fu40 fu40Var) {
        ArrayList arrayList;
        MusicPickerList musicPickerList;
        MusicPickerState musicPickerState2 = musicPickerState;
        fu40 fu40Var2 = fu40Var;
        MusicDto musicDto = musicPickerState2.g;
        PickerTechMetrics pickerTechMetrics = musicPickerState2.b;
        List<MusicPickerList> list = musicPickerState2.j;
        if (fu40Var2 instanceof wt40) {
            return j(musicPickerState2, ((wt40) fu40Var2).b, MusicPickerLoadingState.Loading);
        }
        if (fu40Var2 instanceof au40) {
            return j(musicPickerState2, ((au40) fu40Var2).b, MusicPickerLoadingState.NextPageLoading);
        }
        String str = "";
        int i = 0;
        MusicDto musicDto2 = null;
        Integer num = null;
        musicDto2 = null;
        musicDto2 = null;
        if (fu40Var2 instanceof ut40) {
            ut40 ut40Var = (ut40) fu40Var2;
            MusicPickerList musicPickerList2 = ut40Var.b;
            ta90 ta90Var = ut40Var.c;
            ArrayList arrayList2 = new ArrayList(list);
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((MusicPickerList) next).Y0(), musicPickerList2.Y0())) {
                    break;
                }
                i++;
            }
            Integer valueOf = i != -1 ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                MusicPickerList musicPickerList3 = (MusicPickerList) arrayList2.get(valueOf.intValue());
                int intValue = valueOf.intValue();
                if (musicPickerList3 instanceof MusicPickerList.Tracks) {
                    MusicPickerList.Tracks tracks = (MusicPickerList.Tracks) musicPickerList3;
                    String str2 = tracks.c;
                    if (musicPickerList2 instanceof MusicPickerList.Tracks) {
                        str = ((MusicPickerList.Tracks) musicPickerList2).c;
                    } else if (musicPickerList2 instanceof MusicPickerList.Playlists) {
                        str = ((MusicPickerList.Playlists) musicPickerList2).c;
                    }
                    if (epx.f(str2, str)) {
                        int i2 = ta90Var.a;
                        ArrayList arrayList3 = ta90Var.e;
                        ArrayList arrayList4 = arrayList3;
                        if (i2 != 0) {
                            arrayList4 = m(arrayList3, tracks.d);
                        }
                        musicPickerList = MusicPickerList.Tracks.a(tracks, null, arrayList4, MusicPickerLoadingState.Loaded, ta90Var.b, ta90Var.c, false, 67);
                    } else {
                        musicPickerList = tracks;
                    }
                } else if (musicPickerList3 instanceof MusicPickerList.SelectedPlaylist) {
                    MusicPickerList.SelectedPlaylist selectedPlaylist = (MusicPickerList.SelectedPlaylist) musicPickerList3;
                    int i3 = ta90Var.a;
                    ArrayList arrayList5 = ta90Var.e;
                    ArrayList arrayList6 = arrayList5;
                    if (i3 != 0) {
                        arrayList6 = m(arrayList5, selectedPlaylist.d);
                    }
                    musicPickerList = MusicPickerList.SelectedPlaylist.a(selectedPlaylist, arrayList6, MusicPickerLoadingState.Loaded, ta90Var.b, ta90Var.c, 3);
                } else {
                    boolean z = musicPickerList3 instanceof MusicPickerList.Playlists;
                    musicPickerList = musicPickerList3;
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                arrayList2.set(intValue, musicPickerList);
            }
            return MusicPickerState.a(musicPickerState2, null, null, null, arrayList2, null, null, false, false, null, 32511);
        }
        if (fu40Var2 instanceof vt40) {
            return j(musicPickerState2, ((vt40) fu40Var2).b, MusicPickerLoadingState.Loading);
        }
        if (fu40Var2 instanceof zt40) {
            return j(musicPickerState2, ((zt40) fu40Var2).b, MusicPickerLoadingState.NextPageLoading);
        }
        if (!(fu40Var2 instanceof tt40)) {
            if (fu40Var2 instanceof ku40) {
                ku40 ku40Var = (ku40) fu40Var2;
                MusicTrack musicTrack = ku40Var.b;
                List<MusicDto> list2 = musicPickerState2.f;
                List<MusicDto> list3 = list2;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        if (s1v.m((MusicDto) it2.next(), musicTrack)) {
                            ArrayList arrayList7 = new ArrayList(list2);
                            arrayList7.removeIf(new pu40(new hxl(ku40Var, 21), i));
                            if (!list2.isEmpty()) {
                                musicDto = null;
                            }
                            musicDto2 = musicDto;
                            arrayList = arrayList7;
                            return k(musicPickerState2, arrayList, musicDto2);
                        }
                    }
                }
                if (musicPickerState2.h) {
                    ArrayList arrayList8 = new ArrayList(list2);
                    int size = arrayList8.size();
                    arrayList = arrayList8;
                    if (size < musicPickerState2.c) {
                        arrayList8.add(jq4.b(musicTrack));
                        arrayList = arrayList8;
                    }
                } else {
                    arrayList = Collections.singletonList(jq4.b(musicTrack));
                }
                return k(musicPickerState2, arrayList, musicDto2);
            }
            if (fu40Var2 instanceof ju40) {
                List<MusicDto> list4 = ((ju40) fu40Var2).b;
                if (!list4.isEmpty()) {
                    musicDto = null;
                }
                return k(musicPickerState2, list4, musicDto);
            }
            if (fu40Var2 instanceof iu40) {
                return MusicPickerState.a(musicPickerState2, null, null, null, null, null, null, false, ((iu40) fu40Var2).b, null, 28671);
            }
            if (fu40Var2 instanceof fu40.b) {
                return k(musicPickerState2, EmptyList.b, null);
            }
            if (fu40Var2 instanceof fu40.c) {
                fu40.c cVar = (fu40.c) fu40Var2;
                if (cVar instanceof fu40.c.C2894c) {
                    ArrayList arrayList9 = new ArrayList(list);
                    if (!arrayList9.isEmpty()) {
                        arrayList9.set(e43.h(list), i((MusicPickerList) j5g.i0(list), "", true));
                    }
                    s3q0 s3q0Var = s3q0.a;
                    return MusicPickerState.a(musicPickerState2, null, null, null, arrayList9, null, null, false, false, null, 32511);
                }
                if (cVar instanceof fu40.c.b) {
                    ArrayList arrayList10 = new ArrayList(list);
                    if (!arrayList10.isEmpty()) {
                        arrayList10.set(e43.h(list), i((MusicPickerList) j5g.i0(list), "", false));
                    }
                    s3q0 s3q0Var2 = s3q0.a;
                    return MusicPickerState.a(musicPickerState2, null, null, null, arrayList10, null, null, false, false, null, 32511);
                }
                if (cVar instanceof fu40.c.d) {
                    fu40.c.d dVar = (fu40.c.d) cVar;
                    List<MusicPickerList> list5 = list;
                    if (!list5.isEmpty()) {
                        MusicPickerList musicPickerList4 = (MusicPickerList) j5g.i0(list);
                        ArrayList arrayList11 = new ArrayList(list5);
                        if (l((MusicPickerList) arrayList11.get(e43.h(list)))) {
                            arrayList11.set(e43.h(list), i(musicPickerList4, dVar.b, true));
                        }
                        s3q0 s3q0Var3 = s3q0.a;
                        return MusicPickerState.a(musicPickerState2, null, null, null, arrayList11, null, null, false, false, null, 32511);
                    }
                } else {
                    if (!(cVar instanceof fu40.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<MusicPickerList> list6 = list;
                    if (!list6.isEmpty()) {
                        MusicPickerList musicPickerList5 = (MusicPickerList) j5g.i0(list);
                        ArrayList arrayList12 = new ArrayList(list6);
                        if (l((MusicPickerList) arrayList12.get(e43.h(list)))) {
                            arrayList12.set(e43.h(list), i(musicPickerList5, "", true));
                        }
                        s3q0 s3q0Var4 = s3q0.a;
                        return MusicPickerState.a(musicPickerState2, null, null, null, arrayList12, null, null, false, false, null, 32511);
                    }
                }
            } else {
                if (fu40Var2 instanceof gu40) {
                    gu40 gu40Var = (gu40) fu40Var2;
                    return MusicPickerState.a(musicPickerState2, null, null, null, null, gu40Var.c, gu40Var.b, false, false, null, 31231);
                }
                if (!(fu40Var2 instanceof hu40)) {
                    if (!(fu40Var2 instanceof lu40)) {
                        if (fu40Var2 instanceof mu40) {
                            return MusicPickerState.a(musicPickerState2, PickerTechMetrics.a(pickerTechMetrics, 0L, null, Long.valueOf(((mu40) fu40Var2).b), 3), null, null, null, null, null, false, false, null, 32766);
                        }
                        if (fu40Var2 instanceof st40) {
                            return j(musicPickerState2, ((st40) fu40Var2).b, MusicPickerLoadingState.Error);
                        }
                        if (fu40Var2 instanceof xt40) {
                            return MusicPickerState.a(musicPickerState2, null, null, null, null, null, null, ((xt40) fu40Var2).b, false, null, 30719);
                        }
                        if (fu40Var2 instanceof yt40) {
                            return j(musicPickerState2, ((yt40) fu40Var2).b, MusicPickerLoadingState.NextPageLoadingError);
                        }
                        if (fu40Var2 instanceof bu40) {
                            ArrayList arrayList13 = new ArrayList(list);
                            if (!arrayList13.isEmpty()) {
                                arrayList13.remove(e43.h(arrayList13));
                            }
                            s3q0 s3q0Var5 = s3q0.a;
                            return MusicPickerState.a(musicPickerState2, null, null, null, arrayList13, null, null, false, false, null, 32511);
                        }
                        if (fu40Var2 instanceof com.vk.newsfeed.posting.music_picker.domain.model.a) {
                            ArrayList arrayList14 = new ArrayList(list);
                            arrayList14.add(((com.vk.newsfeed.posting.music_picker.domain.model.a) fu40Var2).b);
                            s3q0 s3q0Var6 = s3q0.a;
                            return MusicPickerState.a(musicPickerState2, null, null, null, arrayList14, null, null, false, false, null, 32511);
                        }
                        if (fu40Var2 instanceof com.vk.newsfeed.posting.music_picker.domain.model.b) {
                            ArrayList arrayList15 = new ArrayList(list);
                            arrayList15.add(((com.vk.newsfeed.posting.music_picker.domain.model.b) fu40Var2).b);
                            s3q0 s3q0Var7 = s3q0.a;
                            return MusicPickerState.a(musicPickerState2, null, null, null, arrayList15, null, null, false, false, null, 32511);
                        }
                        if (!(fu40Var2 instanceof fu40.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        fu40.a aVar = (fu40.a) fu40Var2;
                        if (aVar instanceof cu40) {
                            return MusicPickerState.a(musicPickerState2, null, null, null, null, null, null, false, false, SnippetOnboardingState.UNAVAILABLE, 16383);
                        }
                        if (aVar instanceof du40) {
                            return MusicPickerState.a(musicPickerState2, null, null, null, null, null, null, false, false, SnippetOnboardingState.PENDING_TOOLTIP, 16383);
                        }
                        if (aVar instanceof eu40) {
                            return MusicPickerState.a(musicPickerState2, null, null, null, null, null, null, false, false, a.$EnumSwitchMapping$0[musicPickerState2.p.ordinal()] == 1 ? SnippetOnboardingState.TOOLTIP : SnippetOnboardingState.UNAVAILABLE, 16383);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    if (pickerTechMetrics.c == null) {
                        return MusicPickerState.a(musicPickerState2, PickerTechMetrics.a(pickerTechMetrics, 0L, Long.valueOf(((lu40) fu40Var2).b), null, 5), null, null, null, null, null, false, false, null, 32766);
                    }
                }
            }
            return musicPickerState2;
        }
        tt40 tt40Var = (tt40) fu40Var2;
        MusicPickerList musicPickerList6 = tt40Var.b;
        ArrayList arrayList16 = new ArrayList(list);
        Iterator it3 = arrayList16.iterator();
        int i4 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i4 = -1;
                break;
            }
            Object next2 = it3.next();
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            if (epx.f(((MusicPickerList) next2).Y0(), musicPickerList6.Y0())) {
                break;
            }
            i4++;
        }
    }

    @Override // xsna.dm50
    public final xu40 d() {
        return new xu40(e(new xd40(this, 2)));
    }

    @Override // xsna.dm50
    public final void h(MusicPickerState musicPickerState, xu40 xu40Var) {
        f(xu40Var.a, musicPickerState);
    }
}
