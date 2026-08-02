package com.yandex.go.navigator.incidents.experiment;

import defpackage.gsq0;
import defpackage.i2v;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.tov;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/navigator/incidents/experiment/Incident;", "", "Companion", "tov", "Camera", "Police", "Accident", "Reconstruction", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Incident {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Incident[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Incident Accident;
    public static final Incident Camera;
    public static final tov Companion;
    public static final Incident Police;
    public static final Incident Reconstruction;

    static {
        Incident incident = new Incident("Camera", 0);
        Camera = incident;
        Incident incident2 = new Incident("Police", 1);
        Police = incident2;
        Incident incident3 = new Incident("Accident", 2);
        Accident = incident3;
        Incident incident4 = new Incident("Reconstruction", 3);
        Reconstruction = incident4;
        Incident[] incidentArr = {incident, incident2, incident3, incident4};
        $VALUES = incidentArr;
        $ENTRIES = kotlin.enums.a.a(incidentArr);
        Companion = new tov();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new i2v(9));
    }

    public static Incident valueOf(String str) {
        return (Incident) Enum.valueOf(Incident.class, str);
    }

    public static Incident[] values() {
        return (Incident[]) $VALUES.clone();
    }
}
