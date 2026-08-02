package defpackage;

/* loaded from: classes6.dex */
public final class hnh implements qo21 {
    public static final hnh a = new hnh();
    public static final ro21 b;
    public static final ro21 c;
    public static final ro21 d;

    static {
        int i = d0h0.user_location_icon_frame;
        int i2 = c0h0.ic_user_location_arrow;
        b = new ro21(i, i2, 0, 248, new int[]{i, d0h0.user_location_icon_frame_1, d0h0.user_location_icon_frame_2, d0h0.user_location_icon_frame_3});
        c = new ro21(i, i2, 0, 252, null);
        d = new ro21(d0h0.user_sharing_location_icon_frame, c0h0.ic_user_sharing_location_arrow, 0, 252, null);
    }

    @Override // defpackage.qo21
    public final ro21 a() {
        return d;
    }

    @Override // defpackage.qo21
    public final int b() {
        return d0h0.user_location_icon;
    }

    @Override // defpackage.qo21
    public final ro21 c() {
        return b;
    }

    @Override // defpackage.qo21
    public final ro21 d() {
        return c;
    }
}
