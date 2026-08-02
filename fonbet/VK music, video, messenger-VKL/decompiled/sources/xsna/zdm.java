package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.attaches.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.egg0;
import xsna.ye20;

/* compiled from: DialogGetMediaAttachHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class zdm extends le6<Pair<? extends List<? extends AttachForMediaViewer>, ? extends List<? extends AttachForMediaViewer>>> {
    public final AttachForMediaViewer b;
    public final ImageViewer.SwipeDirection c;
    public final Source d;
    public final int e;
    public final int f;

    /* compiled from: DialogGetMediaAttachHistoryCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageViewer.SwipeDirection.values().length];
            try {
                iArr2[ImageViewer.SwipeDirection.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ImageViewer.SwipeDirection.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageViewer.SwipeDirection.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public zdm(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, Source source) {
        int i;
        this.b = attachForMediaViewer;
        this.c = swipeDirection;
        this.d = source;
        int i2 = a.$EnumSwitchMapping$1[swipeDirection.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i = 30;
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = -30;
            }
        } else {
            i = 15;
            i3 = -7;
        }
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i3));
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        this.e = intValue;
        this.f = intValue2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v36, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [kotlin.collections.EmptyList] */
    @Override // xsna.le6
    public final Pair<? extends List<? extends AttachForMediaViewer>, ? extends List<? extends AttachForMediaViewer>> e(w2w w2wVar) {
        List<Attach> r;
        List<Attach> r2;
        Pair pair;
        Object subList;
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        ImageViewer.SwipeDirection swipeDirection = this.c;
        AttachForMediaViewer attachForMediaViewer = this.b;
        if (i == 1) {
            long y = attachForMediaViewer.y();
            int sa = attachForMediaViewer.sa();
            d040 o = w2wVar.I0().o();
            int i2 = a.$EnumSwitchMapping$1[swipeDirection.ordinal()];
            if (i2 == 1) {
                r = o.r(y, sa, 7, Direction.BEFORE, e43.l(9, 20));
                r2 = o.r(y, sa, 7, Direction.AFTER, e43.l(9, 20));
            } else if (i2 == 2) {
                r = o.r(y, sa, 30, Direction.BEFORE, e43.l(9, 20));
                r2 = EmptyList.b;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                r = EmptyList.b;
                r2 = o.r(y, sa, 30, Direction.AFTER, e43.l(9, 20));
            }
            pair = new Pair(r, r2);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long y2 = attachForMediaViewer.y();
            int sa2 = attachForMediaViewer.sa();
            int position = attachForMediaViewer.getPosition();
            List<HistoryAttach> list = ((ye20.a) fo50.v(new df20(y2, sa2, position, this.e, this.f, e43.l(MediaType.VIDEO, MediaType.PHOTO), w2wVar.Q0()), w2wVar, "DialogGetMediaAttachHistoryCmd.MessagesGetNewHistoryAttachmentsApiCmd", 2)).a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HistoryAttach) it.next()).d);
            }
            egg0 egg0Var = new egg0(new ArrayList(arrayList));
            int i3 = a.$EnumSwitchMapping$1[swipeDirection.ordinal()];
            if (i3 == 1) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = egg0Var.iterator();
                while (true) {
                    ListIterator listIterator = ((egg0.a) it2).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    AttachForMediaViewer attachForMediaViewer2 = (AttachForMediaViewer) ((Attach) previous);
                    boolean z = attachForMediaViewer2.sa() == sa2 && attachForMediaViewer2.getPosition() == position;
                    boolean z2 = attachForMediaViewer2.sa() != sa2;
                    if (z || z2) {
                        arrayList2.add(previous);
                    }
                }
                Iterator it3 = arrayList2.iterator();
                int i4 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    AttachForMediaViewer attachForMediaViewer3 = (AttachForMediaViewer) ((Attach) it3.next());
                    if (attachForMediaViewer3.sa() == sa2 && attachForMediaViewer3.getPosition() == position) {
                        break;
                    }
                    i4++;
                }
                boolean z3 = (egg0Var.size() == 0 || i4 == -1) ? false : true;
                egg0Var = z3 ? arrayList2.subList(0, i4) : EmptyList.b;
                subList = z3 ? arrayList2.subList(i4 + 1, arrayList2.size()) : EmptyList.b;
            } else if (i3 == 2) {
                subList = EmptyList.b;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                egg0Var = EmptyList.b;
                subList = egg0Var;
            }
            pair = new Pair(egg0Var, subList);
        }
        Iterable iterable = (Iterable) pair.i();
        ArrayList arrayList3 = new ArrayList(c5g.u(iterable, 10));
        Iterator it4 = iterable.iterator();
        while (it4.hasNext()) {
            arrayList3.add((AttachForMediaViewer) ((Attach) it4.next()));
        }
        Iterable iterable2 = (Iterable) pair.j();
        ArrayList arrayList4 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it5 = iterable2.iterator();
        while (it5.hasNext()) {
            arrayList4.add((AttachForMediaViewer) ((Attach) it5.next()));
        }
        return new Pair<>(arrayList3, arrayList4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdm)) {
            return false;
        }
        zdm zdmVar = (zdm) obj;
        return epx.f(this.b, zdmVar.b) && this.c == zdmVar.c && this.d == zdmVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogGetMediaAttachHistoryCmd(attach=" + this.b + ", swipeDirection=" + this.c + ", source=" + this.d + ')';
    }
}
