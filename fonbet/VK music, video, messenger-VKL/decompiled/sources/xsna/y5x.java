package xsna;

import android.app.Activity;
import android.os.Environment;
import android.widget.Toast;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: InspectorImpl.kt */
/* loaded from: classes18.dex */
public final class y5x implements gzs<s3q0> {
    public final /* synthetic */ q5x b;
    public final /* synthetic */ Activity c;

    public y5x(q5x q5xVar, Activity activity) {
        this.b = q5xVar;
        this.c = activity;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        zar zarVar = this.b.f;
        HashSet<String> hashSet = zarVar.d;
        HashSet<String> hashSet2 = zarVar.c;
        HashSet<String> hashSet3 = zarVar.b;
        zarVar.a = false;
        Activity activity = this.c;
        if (anj.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            h90.i(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 1);
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.exists()) {
            externalStoragePublicDirectory.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStoragePublicDirectory, "report.txt"), false);
            try {
                fileOutputStream.write("XML:\n".getBytes(emb.b));
                Iterator<String> it = hashSet3.iterator();
                while (it.hasNext()) {
                    fileOutputStream.write((it.next() + '\n').getBytes(emb.b));
                }
                fileOutputStream.write("Views:\n".getBytes(emb.b));
                Iterator<String> it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    fileOutputStream.write((it2.next() + '\n').getBytes(emb.b));
                }
                fileOutputStream.write("Classes:\n".getBytes(emb.b));
                Iterator<String> it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    fileOutputStream.write((it3.next() + '\n').getBytes(emb.b));
                }
                s3q0 s3q0Var = s3q0.a;
                fileOutputStream.close();
                Toast.makeText(activity, "Stopped and saved to report.txt", 1).show();
            } finally {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        hashSet3.clear();
        hashSet2.clear();
        hashSet.clear();
        return s3q0.a;
    }
}
