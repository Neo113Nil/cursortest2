package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class k601 extends Fragment implements t4z {
    public static final WeakHashMap i = new WeakHashMap();
    public final x401 h = new x401();

    @Override // xsna.t4z
    public final void Hm(String str, @NonNull c4z c4zVar) {
        this.h.a(str, c4zVar);
    }

    @Override // xsna.t4z
    @Nullable
    public final c4z Y3(Class cls, String str) {
        return (c4z) cls.cast(this.h.a.get(str));
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.h.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        super.onActivityResult(i2, i3, intent);
        Iterator it = this.h.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onActivityResult(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.h.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        x401 x401Var = this.h;
        x401Var.b = 5;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x401 x401Var = this.h;
        x401Var.b = 3;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.h.c(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        x401 x401Var = this.h;
        x401Var.b = 2;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        x401 x401Var = this.h;
        x401Var.b = 4;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onStop();
        }
    }
}
