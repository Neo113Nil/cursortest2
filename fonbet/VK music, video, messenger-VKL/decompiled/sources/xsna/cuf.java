package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* compiled from: ClipsWrapperTabsResolver.kt */
/* loaded from: classes17.dex */
public final class cuf {
    public final zof a;

    /* compiled from: ClipsWrapperTabsResolver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedTab.SingleClipFromBlock.SourceBlockType.values().length];
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.SHOPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTab.SingleClipFromBlock.SourceBlockType.RETENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cuf(fyu fyuVar, zof zofVar) {
        this.a = zofVar;
    }

    public static ArrayList a(ArrayList arrayList, int i, ClipFeedTab clipFeedTab) {
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ClipFeedTab clipFeedTab2 = (ClipFeedTab) obj;
            if (i2 == i) {
                clipFeedTab2 = clipFeedTab;
            }
            arrayList2.add(clipFeedTab2);
            i2 = i3;
        }
        return arrayList2;
    }

    public static Pair b(ArrayList arrayList, ClipsWrapperInputArguments clipsWrapperInputArguments) {
        ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(clipsWrapperInputArguments.b(), clipsWrapperInputArguments.c());
        if (clipFeedTab == null) {
            return new Pair(arrayList, 0);
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((ClipFeedTab) it.next()).getClass() == clipFeedTab.getClass()) {
                break;
            }
            i++;
        }
        return new Pair(arrayList, Integer.valueOf(i >= 0 ? i : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2 != null) goto L21;
     */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair c(ArrayList arrayList, ClipsWrapperInputArguments clipsWrapperInputArguments) {
        if (arrayList.isEmpty()) {
            return new Pair(clipsWrapperInputArguments.c(), Integer.valueOf(clipsWrapperInputArguments.b()));
        }
        ClipFeedTab clipFeedTab = (ClipFeedTab) j5g.b0(clipsWrapperInputArguments.b(), clipsWrapperInputArguments.c());
        Object obj = null;
        if (clipFeedTab != null) {
            if (!d(clipFeedTab)) {
                clipFeedTab = null;
            }
        }
        Iterator<T> it = clipsWrapperInputArguments.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (d((ClipFeedTab) next)) {
                obj = next;
                break;
            }
        }
        clipFeedTab = (ClipFeedTab) obj;
        int i = -1;
        if (clipFeedTab != null) {
            if (clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock) {
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    ClipFeedTab clipFeedTab2 = (ClipFeedTab) it2.next();
                    int i3 = a.$EnumSwitchMapping$0[((ClipFeedTab.SingleClipFromBlock) clipFeedTab).d.ordinal()];
                    if (i3 != 1 ? i3 != 2 ? false : clipFeedTab2 instanceof ClipFeedTab.ClipsFromTrendsSource.Top : clipFeedTab2 instanceof ClipFeedTab.ClipsFromShopsSource.Top) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    return new Pair(a(arrayList, i2, clipFeedTab), Integer.valueOf(i2));
                }
            }
            Iterator it3 = arrayList.iterator();
            int i4 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((ClipFeedTab) it3.next()).getClass() == clipFeedTab.getClass()) {
                    i = i4;
                    break;
                }
                i4++;
            }
            if (i >= 0) {
                return new Pair(a(arrayList, i, clipFeedTab), Integer.valueOf(i));
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                ClipFeedTab clipFeedTab3 = (ClipFeedTab) it4.next();
                if (clipFeedTab3 instanceof ClipFeedTab.TopVideo) {
                    clipFeedTab3 = clipFeedTab;
                }
                arrayList2.add(clipFeedTab3);
            }
            return new Pair(arrayList2, 0);
        }
        ClipFeedTab clipFeedTab4 = (ClipFeedTab) j5g.b0(clipsWrapperInputArguments.b(), clipsWrapperInputArguments.c());
        if (clipFeedTab4 != null) {
            Iterator it5 = arrayList.iterator();
            int i5 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i5 = -1;
                    break;
                }
                if (((ClipFeedTab) it5.next()).getClass() == clipFeedTab4.getClass()) {
                    break;
                }
                i5++;
            }
            if (i5 >= 0) {
                return new Pair(arrayList, Integer.valueOf(i5));
            }
        }
        ClipFeedTab clipFeedTab5 = (ClipFeedTab) j5g.a0(clipsWrapperInputArguments.c());
        if (clipFeedTab5 == null) {
            return new Pair(arrayList, 0);
        }
        if (((Boolean) clipsWrapperInputArguments.p.getValue()).booleanValue()) {
            Iterator it6 = arrayList.iterator();
            int i6 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i6 = -1;
                    break;
                }
                if (((ClipFeedTab) it6.next()).getClass() == clipFeedTab5.getClass()) {
                    break;
                }
                i6++;
            }
            if (i6 >= 0) {
                return new Pair(a(arrayList, i6, clipFeedTab5), Integer.valueOf(i6));
            }
            if (clipFeedTab5 instanceof ClipFeedTab.SingleClip) {
                Iterator it7 = arrayList.iterator();
                int i7 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    if (((ClipFeedTab) it7.next()) instanceof ClipFeedTab.TopVideo) {
                        i = i7;
                        break;
                    }
                    i7++;
                }
                int i8 = i >= 0 ? i : 0;
                return new Pair(a(arrayList, i8, clipFeedTab5), Integer.valueOf(i8));
            }
        }
        return new Pair(j5g.H0(clipsWrapperInputArguments.c(), 1), 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.g == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ClipFeedTab clipFeedTab) {
        if (clipFeedTab instanceof ClipFeedTab.SingleClip) {
            ClipFeedTab.SingleClip singleClip = (ClipFeedTab.SingleClip) clipFeedTab;
            if (!singleClip.f) {
            }
            return true;
        }
        if (!(clipFeedTab instanceof ClipFeedTab.SingleClipByVideoId) && !(clipFeedTab instanceof ClipFeedTab.NewsfeedDiscoverMedia) && !(clipFeedTab instanceof ClipFeedTab.LivesTop) && !(clipFeedTab instanceof ClipFeedTab.LikedClips)) {
            if (!(clipFeedTab instanceof ClipFeedTab.SingleClipFromBlock)) {
                return false;
            }
            gaf A = this.a.A();
            int i = a.$EnumSwitchMapping$0[((ClipFeedTab.SingleClipFromBlock) clipFeedTab).d.ordinal()];
            if (i != 1) {
                if (i != 2 || !A.a || !A.c) {
                    return false;
                }
            } else if (!A.a || !A.b) {
                return false;
            }
        }
        return true;
    }
}
