package xsna;

import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;

/* compiled from: RepliesNavigationEvent.kt */
/* loaded from: classes18.dex */
public interface i2g0 extends h2g0 {

    /* compiled from: RepliesNavigationEvent.kt */
    public static final class a implements i2g0 {
        public final int a;
        public final ListBuilder b;

        public a(int i, ListBuilder listBuilder) {
            this.a = i;
            this.b = listBuilder;
        }
    }

    /* compiled from: RepliesNavigationEvent.kt */
    public static final class b implements i2g0 {
        public final ArrayList a;
        public final int b;

        public b(ArrayList arrayList, int i) {
            this.a = arrayList;
            this.b = i;
        }
    }

    /* compiled from: RepliesNavigationEvent.kt */
    public static final class c implements i2g0 {
        public final UserId a;
        public final UserId b;

        public c(UserId userId, UserId userId2) {
            this.a = userId;
            this.b = userId2;
        }
    }

    /* compiled from: RepliesNavigationEvent.kt */
    public static final class d implements i2g0 {
        public final UserId a;

        public d(UserId userId) {
            this.a = userId;
        }
    }
}
