package xsna;

import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: StoriesBlocksEventControllerImpl.kt */
/* loaded from: classes6.dex */
public final class jrl0 implements erl0 {
    public final p870 a;
    public final Set<rov> b = Collections.newSetFromMap(new WeakHashMap());
    public final frl0 c = new frl0(this, 0);
    public final grl0 d = new bd70() { // from class: xsna.grl0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            StoryEntry storyEntry = (StoryEntry) obj;
            Iterator<rov> it = jrl0.this.b.iterator();
            while (it.hasNext()) {
                rov next = it.next();
                if (next != null) {
                    next.G1(storyEntry);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    it.remove();
                }
            }
        }
    };
    public final hrl0 e = new bd70() { // from class: xsna.hrl0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            ArrayList<StoriesContainer> arrayList = (ArrayList) obj;
            Iterator<rov> it = jrl0.this.b.iterator();
            while (it.hasNext()) {
                rov next = it.next();
                if (next != null) {
                    next.d4(arrayList);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    it.remove();
                }
            }
        }
    };
    public final irl0 f = new bd70() { // from class: xsna.irl0
        @Override // xsna.bd70
        public final void x0(int i, int i2, Object obj) {
            zjm0 zjm0Var = (zjm0) obj;
            Iterator<rov> it = jrl0.this.b.iterator();
            while (it.hasNext()) {
                rov next = it.next();
                if (next != null) {
                    next.H3(zjm0Var);
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    it.remove();
                }
            }
        }
    };
    public final r43 g = new r43(this, 1);

    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.grl0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [xsna.hrl0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [xsna.irl0] */
    public jrl0(p870 p870Var) {
        this.a = p870Var;
    }

    @Override // xsna.erl0
    public final void a(rov rovVar) {
        this.b.add(rovVar);
    }

    @Override // xsna.erl0
    public final void b(rov rovVar) {
        this.b.remove(rovVar);
    }

    @Override // xsna.erl0
    public final void onPause() {
        frl0 frl0Var = this.c;
        p870 p870Var = this.a;
        p870Var.g(frl0Var);
        p870Var.g(this.e);
        p870Var.g(this.d);
        p870Var.g(this.f);
    }

    @Override // xsna.erl0
    public final void onResume() {
        frl0 frl0Var = this.c;
        p870 p870Var = this.a;
        p870Var.b(100, frl0Var);
        p870Var.b(101, this.e);
        p870Var.b(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, this.d);
        p870Var.b(102, this.f);
        p870Var.b(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, this.g);
    }
}
