package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: CaptureBundles.java */
/* loaded from: classes11.dex */
public final class as9 {

    /* compiled from: CaptureBundles.java */
    public static final class a implements zr9 {
        public final List<androidx.camera.core.impl.g> a;

        public a(List<androidx.camera.core.impl.g> list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // xsna.zr9
        public final List<androidx.camera.core.impl.g> a() {
            return this.a;
        }
    }

    @NonNull
    public static a a() {
        return new a(Arrays.asList(new g.a()));
    }
}
