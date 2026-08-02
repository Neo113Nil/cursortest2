package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class n0v {

    @NonNull
    public static final DataType a;

    @NonNull
    public static final DataType b;

    @NonNull
    public static final DataType c;

    @NonNull
    public static final DataType d;

    @NonNull
    public static final DataType e;

    @NonNull
    public static final DataType f;

    @NonNull
    public static final DataType g;

    @NonNull
    public static final DataType h;

    @NonNull
    public static final DataType i;

    @NonNull
    public static final DataType j;

    @NonNull
    public static final DataType k;

    @NonNull
    public static final DataType l;

    @NonNull
    public static final DataType m;

    static {
        Field field = o0v.a;
        Field field2 = o0v.e;
        Field field3 = o0v.i;
        Field field4 = o0v.j;
        a = new DataType("com.google.blood_pressure", 1, "https://www.googleapis.com/auth/fitness.blood_pressure.read", "https://www.googleapis.com/auth/fitness.blood_pressure.write", field, field2, field3, field4);
        Field field5 = o0v.k;
        Field field6 = o0v.l;
        Field field7 = Field.x;
        Field field8 = o0v.m;
        Field field9 = o0v.n;
        b = new DataType("com.google.blood_glucose", 1, "https://www.googleapis.com/auth/fitness.blood_glucose.read", "https://www.googleapis.com/auth/fitness.blood_glucose.write", field5, field6, field7, field8, field9);
        Field field10 = o0v.o;
        Field field11 = o0v.s;
        Field field12 = o0v.w;
        Field field13 = o0v.x;
        Field field14 = o0v.y;
        c = new DataType("com.google.oxygen_saturation", 1, "https://www.googleapis.com/auth/fitness.oxygen_saturation.read", "https://www.googleapis.com/auth/fitness.oxygen_saturation.write", field10, field11, field12, field13, field14);
        Field field15 = o0v.z;
        Field field16 = o0v.A;
        d = new DataType("com.google.body.temperature", 1, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", field15, field16);
        new DataType("com.google.body.temperature.basal", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", field15, field16);
        e = new DataType("com.google.cervical_mucus", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", o0v.B, o0v.C);
        f = new DataType("com.google.cervical_position", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", o0v.D, o0v.E, o0v.F);
        g = new DataType("com.google.menstruation", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", o0v.G);
        h = new DataType("com.google.ovulation_test", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", o0v.H);
        i = new DataType("com.google.vaginal_spotting", 1, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", Field.M);
        j = new DataType("com.google.blood_pressure.summary", 2, "https://www.googleapis.com/auth/fitness.blood_pressure.read", "https://www.googleapis.com/auth/fitness.blood_pressure.write", o0v.b, o0v.d, o0v.c, o0v.f, o0v.h, o0v.g, field3, field4);
        Field field17 = Field.F;
        Field field18 = Field.G;
        Field field19 = Field.H;
        k = new DataType("com.google.blood_glucose.summary", 2, "https://www.googleapis.com/auth/fitness.blood_glucose.read", "https://www.googleapis.com/auth/fitness.blood_glucose.write", field17, field18, field19, field6, field7, field8, field9);
        l = new DataType("com.google.oxygen_saturation.summary", 2, "https://www.googleapis.com/auth/fitness.oxygen_saturation.read", "https://www.googleapis.com/auth/fitness.oxygen_saturation.write", o0v.p, o0v.r, o0v.q, o0v.t, o0v.v, o0v.u, field12, field13, field14);
        m = new DataType("com.google.body.temperature.summary", 2, "https://www.googleapis.com/auth/fitness.body_temperature.read", "https://www.googleapis.com/auth/fitness.body_temperature.write", field17, field18, field19, field16);
        new DataType("com.google.body.temperature.basal.summary", 2, "https://www.googleapis.com/auth/fitness.reproductive_health.read", "https://www.googleapis.com/auth/fitness.reproductive_health.write", field17, field18, field19, field16);
    }
}
