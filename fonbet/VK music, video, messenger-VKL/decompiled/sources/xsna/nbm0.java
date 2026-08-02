package xsna;

import android.content.Context;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryEntryExtended;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.ikv0;

/* compiled from: StoryReplyUploadingDelegate.kt */
/* loaded from: classes6.dex */
public final class nbm0 {
    public static final int i;
    public static final int j;
    public final Context a;
    public final uvl0 b;
    public final jcf0 c;
    public final bv9 d = new bv9(this, 16);
    public Pair<UserId, Integer> e;
    public ikv0 f;
    public a g;
    public static final int h = iah0.a(8);
    public static final int k = iah0.a(34);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryReplyUploadingDelegate.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Done;
        public static final a Failed;
        public static final a Publishing;

        static {
            a aVar = new a("Publishing", 0);
            Publishing = aVar;
            a aVar2 = new a("Done", 1);
            Done = aVar2;
            a aVar3 = new a("Failed", 2);
            Failed = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* compiled from: StoryReplyUploadingDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Publishing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Done.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.Failed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 64;
        i = iah0.a(f);
        j = iah0.a(f);
    }

    public nbm0(Context context, uvl0 uvl0Var, jcf0 jcf0Var) {
        this.a = context;
        this.b = uvl0Var;
        this.c = jcf0Var;
    }

    public final void a(int i2, zjm0 zjm0Var) {
        switch (i2) {
            case 102:
                b(zjm0Var, a.Done, false);
                break;
            case 103:
                b(zjm0Var, a.Publishing, false);
                break;
            case 104:
                b(zjm0Var, a.Failed, false);
                break;
        }
    }

    public final void b(zjm0 zjm0Var, a aVar, boolean z) {
        StoryEntry storyEntry;
        int i2;
        StoryEntryExtended storyEntryExtended = zjm0Var.j.f;
        if (storyEntryExtended == null || (storyEntry = storyEntryExtended.b) == null) {
            return;
        }
        boolean equals = new Pair(storyEntry.d, Integer.valueOf(storyEntry.c)).equals(this.e);
        boolean z2 = this.g != aVar || this.f == null || z;
        if (equals && z2) {
            long j2 = this.f != null ? 250L : 0L;
            bv9 bv9Var = this.d;
            i0q0.g(bv9Var);
            ikv0 ikv0Var = this.f;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            this.f = null;
            this.g = aVar;
            Context context = this.a;
            ikv0.a aVar2 = new ikv0.a(bwt0.u(context));
            String Cb = storyEntry.Cb(true);
            if (Cb == null) {
                Cb = "";
            }
            aVar2.t = new ikv0.c.e(new c.d(Cb, null), null, Integer.valueOf(k), 10);
            int i3 = b.$EnumSwitchMapping$0[aVar.ordinal()];
            if (i3 == 1) {
                i2 = R.string.snackbar_story_publishing;
            } else if (i3 == 2) {
                i2 = R.string.snackbar_story_published;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = R.string.snackbar_story_publish_error;
            }
            aVar2.u = new ikv0.d(context.getString(i2), (String) null, aVar == a.Failed ? new ikv0.d.a(context.getString(R.string.snackbar_story_publish_retry), null, new v53(22, this, zjm0Var), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) : null, 2);
            iz8 iz8Var = (iz8) this.c.invoke();
            int i4 = iz8Var != null ? (int) iz8Var.d : 0;
            int i5 = h;
            int i6 = i;
            aVar2.o = Integer.valueOf(i4 > i6 ? i4 + i5 : i6 + i5);
            aVar2.r = Integer.valueOf(j);
            if (aVar == a.Done) {
                aVar2.e = 4000L;
            } else {
                aVar2.e = -1L;
            }
            this.f = aVar2.b();
            i0q0.d(j2, bv9Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0054, code lost:
    
        if (r6.isEmpty() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r6.isEmpty() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Pair<UserId, Integer> pair) {
        List list;
        StoryEntry storyEntry;
        Pair<UserId, Integer> pair2 = null;
        uvl0 uvl0Var = this.b;
        if (uvl0Var != null) {
            list = uvl0Var.f(pair.j().intValue(), pair.i());
            if (list != null) {
            }
        }
        list = null;
        Pair<UserId, Integer> pair3 = this.e;
        List list2 = list;
        if ((list2 == null || list2.isEmpty()) && pair3 != null) {
            if (uvl0Var != null) {
                list = uvl0Var.f(pair3.j().intValue(), pair3.i());
                if (list != null) {
                }
            }
            list = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                int i2 = ((zjm0) next).a;
                do {
                    Object next2 = it.next();
                    int i3 = ((zjm0) next2).a;
                    if (i2 < i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (it.hasNext());
            }
            zjm0 zjm0Var = (zjm0) next;
            if (zjm0Var != null) {
                a aVar = zjm0Var.g != null ? a.Done : zjm0Var.i ? a.Failed : a.Publishing;
                StoryEntryExtended storyEntryExtended = zjm0Var.j.f;
                if (storyEntryExtended != null && (storyEntry = storyEntryExtended.b) != null) {
                    pair2 = new Pair<>(storyEntry.d, Integer.valueOf(storyEntry.c));
                }
                this.e = pair2;
                b(zjm0Var, aVar, true);
                return;
            }
        }
        this.e = null;
        ikv0 ikv0Var = this.f;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        this.f = null;
        this.g = null;
    }
}
