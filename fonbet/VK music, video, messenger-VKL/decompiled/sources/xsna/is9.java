package xsna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

/* compiled from: CarAppApiLevels.java */
/* loaded from: classes11.dex */
public final class is9 {
    public static int a() {
        ClassLoader classLoader = is9.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
        if (resourceAsStream == null) {
            throw new IllegalStateException("Car API level file car-app-api.level not found");
        }
        try {
            String readLine = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int parseInt = Integer.parseInt(readLine);
            if (parseInt >= 1 && parseInt <= 7) {
                return parseInt;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + readLine);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
