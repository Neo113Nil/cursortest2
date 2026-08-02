package xsna;

import com.vk.newsfeed.impl.fragments.PostViewFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g9c0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g9c0(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                String[] strArr = PostViewFragment.T0;
                ((PostViewFragment) obj).io(i2);
                return s3q0.a;
            default:
                jmq0 jmq0Var = (jmq0) obj;
                StringBuilder sb = new StringBuilder("UserProfileAvatarFeatureDelegate: editProfilePhoto(): saltStableId = ");
                String str = jmq0Var.g;
                sb.append(str != null ? Integer.valueOf(str.hashCode()) : null);
                sb.append(", saltFallbackId = ");
                sb.append(jmq0Var.hashCode());
                sb.append(", requestCode = ");
                sb.append(i2);
                return sb.toString();
        }
    }
}
