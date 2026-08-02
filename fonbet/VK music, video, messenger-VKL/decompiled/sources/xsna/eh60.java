package xsna;

import com.vk.newsfeed.api.NewsfeedDeduplicator;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.e9l;

/* compiled from: NewsfeedDeduplicatorImpl.kt */
/* loaded from: classes4.dex */
public final class eh60 implements NewsfeedDeduplicator {
    public final Object a;

    /* compiled from: NewsfeedDeduplicatorImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NewsfeedDeduplicator.ActionType.values().length];
            try {
                iArr[NewsfeedDeduplicator.ActionType.Prepend.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public eh60(final int i) {
        this.a = msy.a(LazyThreadSafetyMode.NONE, new gzs() { // from class: xsna.dh60
            @Override // xsna.gzs
            public final Object invoke() {
                return new e9l(i);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.api.NewsfeedDeduplicator
    public final ArrayList a(NewsfeedDeduplicator.ActionType actionType, ArrayList arrayList, List list) {
        e9l.a aVar = a.$EnumSwitchMapping$0[actionType.ordinal()] == 1 ? e9l.a.b.a : e9l.a.C2788a.a;
        boolean z = actionType != NewsfeedDeduplicator.ActionType.Refresh;
        e9l e9lVar = (e9l) this.a.getValue();
        ArrayList arrayList2 = new ArrayList(list);
        e9lVar.b(aVar, arrayList, arrayList2, z, null);
        return arrayList2;
    }
}
