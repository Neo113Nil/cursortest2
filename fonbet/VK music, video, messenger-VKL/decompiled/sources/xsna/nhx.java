package xsna;

import com.vk.api.sdk.a;
import com.vk.dto.common.id.UserId;

/* compiled from: InternalMethodCall.kt */
/* loaded from: classes.dex */
public class nhx extends com.vk.api.sdk.a {
    public final String q;
    public final String r;
    public final boolean s;
    public final UserId t;

    /* compiled from: InternalMethodCall.kt */
    public static class a extends a.C0374a {
        public String q;
        public String r;
        public boolean s;
        public UserId t;

        @Override // com.vk.api.sdk.a.C0374a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public nhx c() {
            return new nhx(this);
        }

        public a f(boolean z) {
            this.o = z;
            return this;
        }
    }

    public nhx(a aVar) {
        super(aVar);
        this.q = aVar.q;
        this.r = aVar.r;
        this.s = aVar.s;
        this.t = aVar.t;
    }
}
