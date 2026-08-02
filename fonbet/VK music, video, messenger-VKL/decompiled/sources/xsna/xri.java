package xsna;

import android.util.ArraySet;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.typing.ComposingType;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ComposingBeginLpTask.kt */
/* loaded from: classes2.dex */
public final class xri extends e500 {
    public final Peer c;
    public final ArraySet d;
    public final ComposingType e;

    /* compiled from: ComposingBeginLpTask.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposingType.values().length];
            try {
                iArr[ComposingType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposingType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposingType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ComposingType.VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ComposingType.FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ComposingType.VIDEO_MSG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public xri(Peer peer, ArraySet arraySet, ComposingType composingType) {
        super("ComposingBeginLpTask");
        this.c = peer;
        this.d = arraySet;
        this.e = composingType;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        int i = a.$EnumSwitchMapping$0[this.e.ordinal()];
        ArraySet arraySet = this.d;
        Peer peer = this.c;
        switch (i) {
            case 1:
                long j = peer.b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arraySet.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(Long.valueOf(((Peer) it.next()).b));
                }
                z300Var.m(z300Var.q, j, linkedHashSet);
                return;
            case 2:
                long j2 = peer.b;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = arraySet.iterator();
                while (it2.hasNext()) {
                    linkedHashSet2.add(Long.valueOf(((Peer) it2.next()).b));
                }
                z300Var.m(z300Var.r, j2, linkedHashSet2);
                return;
            case 3:
                long j3 = peer.b;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it3 = arraySet.iterator();
                while (it3.hasNext()) {
                    linkedHashSet3.add(Long.valueOf(((Peer) it3.next()).b));
                }
                z300Var.m(z300Var.s, j3, linkedHashSet3);
                return;
            case 4:
                long j4 = peer.b;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Iterator it4 = arraySet.iterator();
                while (it4.hasNext()) {
                    linkedHashSet4.add(Long.valueOf(((Peer) it4.next()).b));
                }
                z300Var.m(z300Var.t, j4, linkedHashSet4);
                return;
            case 5:
                long j5 = peer.b;
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                Iterator it5 = arraySet.iterator();
                while (it5.hasNext()) {
                    linkedHashSet5.add(Long.valueOf(((Peer) it5.next()).b));
                }
                z300Var.m(z300Var.v, j5, linkedHashSet5);
                return;
            case 6:
                long j6 = peer.b;
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                Iterator it6 = arraySet.iterator();
                while (it6.hasNext()) {
                    linkedHashSet6.add(Long.valueOf(((Peer) it6.next()).b));
                }
                z300Var.m(z300Var.u, j6, linkedHashSet6);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
