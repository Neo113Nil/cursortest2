package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: GetMsgReactionsAssetsCmd.kt */
/* loaded from: classes2.dex */
public final class wst {
    public final int a;
    public final ArrayList b;
    public final List<a> c;
    public final List<Integer> d;
    public final a.C3957a e;

    /* compiled from: GetMsgReactionsAssetsCmd.kt */
    public static final class a {
        public final int a;
        public final C3957a b;

        /* compiled from: GetMsgReactionsAssetsCmd.kt */
        /* renamed from: xsna.wst$a$a, reason: collision with other inner class name */
        public static final class C3957a {
            public final String a;
            public final String b;
            public final String c;

            public C3957a(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }
        }

        public a(int i, C3957a c3957a) {
            this.a = i;
            this.b = c3957a;
        }
    }

    public wst(int i, ArrayList arrayList, ArrayList arrayList2, List list, a.C3957a c3957a) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = list;
        this.e = c3957a;
    }
}
