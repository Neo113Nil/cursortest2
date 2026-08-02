package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.attaches.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.egg0;
import xsna.t2b;

/* compiled from: ChannelGetMediaAttachHistoryCmd.kt */
/* loaded from: classes2.dex */
public final class jza extends le6<Pair<? extends List<? extends AttachForMediaViewer>, ? extends List<? extends AttachForMediaViewer>>> {
    public final AttachForMediaViewer b;
    public final ImageViewer.SwipeDirection c;
    public final Source d;
    public final int e;
    public final int f;

    /* compiled from: ChannelGetMediaAttachHistoryCmd.kt */
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

    public jza(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, Source source) {
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
    /* JADX WARN: Type inference failed for: r2v16, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    @Override // xsna.le6
    public final Pair<? extends List<? extends AttachForMediaViewer>, ? extends List<? extends AttachForMediaViewer>> e(w2w w2wVar) {
        List<Attach> v;
        List<Attach> v2;
        Pair pair;
        Object subList;
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        ImageViewer.SwipeDirection swipeDirection = this.c;
        AttachForMediaViewer attachForMediaViewer = this.b;
        if (i == 1) {
            long y = attachForMediaViewer.y();
            int sa = attachForMediaViewer.sa();
            r3b y2 = w2wVar.I0().y();
            int i2 = a.$EnumSwitchMapping$1[swipeDirection.ordinal()];
            if (i2 == 1) {
                v = y2.v(y, sa, 7, Direction.BEFORE, Collections.singletonList(9));
                v2 = y2.v(y, sa, 7, Direction.AFTER, Collections.singletonList(9));
            } else if (i2 == 2) {
                v = y2.v(y, sa, 30, Direction.BEFORE, Collections.singletonList(9));
                v2 = EmptyList.b;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                v = EmptyList.b;
                v2 = y2.v(y, sa, 30, Direction.AFTER, Collections.singletonList(9));
            }
            pair = new Pair(v, v2);
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            long y3 = attachForMediaViewer.y();
            int sa2 = attachForMediaViewer.sa();
            StringBuilder sb = new StringBuilder();
            sb.append(attachForMediaViewer.q());
            sb.append('_');
            sb.append(attachForMediaViewer.getId());
            egg0 egg0Var = new egg0(new ArrayList(((t2b.a) fo50.v(new t2b(y3, sa2, sb.toString(), this.e, this.f, Collections.singletonList(MediaType.PHOTO)), w2wVar, "ChannelMessagesGetHistoryAttachmentsApiCmd", 2)).a));
            int i3 = a.$EnumSwitchMapping$1[swipeDirection.ordinal()];
            if (i3 == 1) {
                ArrayList arrayList = new ArrayList();
                Iterator it = egg0Var.iterator();
                while (true) {
                    ListIterator listIterator = ((egg0.a) it).b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    AttachForMediaViewer attachForMediaViewer2 = (AttachForMediaViewer) ((Attach) previous);
                    boolean z = attachForMediaViewer2.sa() == attachForMediaViewer.sa() && attachForMediaViewer2.getId() == attachForMediaViewer.getId();
                    boolean z2 = attachForMediaViewer2.sa() != attachForMediaViewer.sa();
                    if (z || z2) {
                        arrayList.add(previous);
                    }
                }
                Iterator it2 = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    AttachForMediaViewer attachForMediaViewer3 = (AttachForMediaViewer) ((Attach) it2.next());
                    if (attachForMediaViewer3.sa() == attachForMediaViewer.sa() && attachForMediaViewer3.getPosition() == attachForMediaViewer.getPosition()) {
                        break;
                    }
                    i4++;
                }
                boolean z3 = (egg0Var.size() == 0 || i4 == -1) ? false : true;
                egg0 subList2 = z3 ? arrayList.subList(0, i4) : EmptyList.b;
                subList = z3 ? arrayList.subList(i4 + 1, arrayList.size()) : EmptyList.b;
                egg0Var = subList2;
            } else if (i3 == 2) {
                subList = EmptyList.b;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                subList = egg0Var;
                egg0Var = EmptyList.b;
            }
            pair = new Pair(egg0Var, subList);
        }
        Iterable iterable = (Iterable) pair.i();
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
        Iterator it3 = iterable.iterator();
        while (it3.hasNext()) {
            arrayList2.add((AttachForMediaViewer) ((Attach) it3.next()));
        }
        Iterable iterable2 = (Iterable) pair.j();
        ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it4 = iterable2.iterator();
        while (it4.hasNext()) {
            arrayList3.add((AttachForMediaViewer) ((Attach) it4.next()));
        }
        return new Pair<>(arrayList2, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jza)) {
            return false;
        }
        jza jzaVar = (jza) obj;
        return epx.f(this.b, jzaVar.b) && this.c == jzaVar.c && this.d == jzaVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelGetMediaAttachHistoryCmd(attach=" + this.b + ", swipeDirection=" + this.c + ", source=" + this.d + ')';
    }
}
