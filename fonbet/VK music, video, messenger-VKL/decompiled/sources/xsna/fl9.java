package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraInternal;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.ub9;

/* compiled from: CameraRepository.java */
/* loaded from: classes11.dex */
public final class fl9 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public ugz<Void> d;
    public ub9.a<Void> e;

    @NonNull
    public final LinkedHashSet<CameraInternal> a() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.a) {
            linkedHashSet = new LinkedHashSet<>((Collection<? extends CameraInternal>) this.b.values());
        }
        return linkedHashSet;
    }

    public final void b(@NonNull oi9 oi9Var) throws InitializationException {
        synchronized (this.a) {
            try {
                for (String str : oi9Var.d()) {
                    this.b.put(str, oi9Var.c(str));
                }
            } catch (CameraUnavailableException e) {
                throw new InitializationException(e);
            }
        }
    }
}
