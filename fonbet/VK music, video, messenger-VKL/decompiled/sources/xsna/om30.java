package xsna;

import com.vk.camera.editor.stories.api.base.privacy.StoryPrivacyType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class om30 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ om30(int i, StoryPrivacyType storyPrivacyType, svk0 svk0Var, vfm0 vfm0Var) {
        this.d = vfm0Var;
        this.c = i;
        this.e = storyPrivacyType;
        this.f = svk0Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                vm30 vm30Var = (vm30) this.d;
                bvx bvxVar = (bvx) this.e;
                String str = (String) this.f;
                StringBuilder a = vq.a("ChatScrollIssue: internalSmoothScrollTo position=", this.c, '/');
                a.append(vm30Var.H.f.size() - 1);
                a.append(", scrollTo=");
                a.append(bvxVar);
                return i5s.a(a, ", chain=", str);
            default:
                ((vfm0) this.d).b(this.c, (StoryPrivacyType) this.e, StoryPrivacyType.ALL, (svk0) this.f);
                return s3q0.a;
        }
    }

    public /* synthetic */ om30(int i, vm30 vm30Var, bvx bvxVar, String str) {
        this.c = i;
        this.d = vm30Var;
        this.e = bvxVar;
        this.f = str;
    }
}
