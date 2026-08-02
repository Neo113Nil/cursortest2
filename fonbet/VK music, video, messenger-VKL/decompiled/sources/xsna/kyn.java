package xsna;

import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionOpenUrl;

/* compiled from: DonutBlock.kt */
/* loaded from: classes18.dex */
public final class kyn {
    public final String a;
    public final a b;
    public final Action c;

    /* compiled from: DonutBlock.kt */
    public static abstract class a {
        public final String a;

        /* compiled from: DonutBlock.kt */
        /* renamed from: xsna.kyn$a$a, reason: collision with other inner class name */
        public static final class C3217a extends a {
        }

        /* compiled from: DonutBlock.kt */
        public static final class b extends a {
            public final String b;

            public b(String str, String str2) {
                super(str);
                this.b = str2;
            }
        }

        public a(String str) {
            this.a = str;
        }
    }

    public kyn(String str, a aVar, ActionOpenUrl actionOpenUrl) {
        this.a = str;
        this.b = aVar;
        this.c = actionOpenUrl;
    }
}
