package xsna;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class hsz0 extends Fragment implements t4z {
    public static final WeakHashMap c = new WeakHashMap();
    public final x401 b = new x401();

    @Override // xsna.t4z
    public final void Hm(String str, @NonNull c4z c4zVar) {
        this.b.a(str, c4zVar);
    }

    @Override // xsna.t4z
    @Nullable
    public final Activity O6() {
        return getActivity();
    }

    @Override // xsna.t4z
    @Nullable
    public final c4z Y3(Class cls, String str) {
        return (c4z) cls.cast(this.b.a.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.b.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.b.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.b.b(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        x401 x401Var = this.b;
        x401Var.b = 5;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        x401 x401Var = this.b;
        x401Var.b = 3;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        x401 x401Var = this.b;
        x401Var.b = 2;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        x401 x401Var = this.b;
        x401Var.b = 4;
        Iterator it = x401Var.a.values().iterator();
        while (it.hasNext()) {
            ((c4z) it.next()).onStop();
        }
    }
}
