package xsna;

import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class gti0 implements Callable {
    public final /* synthetic */ int b;

    public /* synthetic */ gti0(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
                sb.append("/editorSession$");
                ArrayList<String> arrayList = hti0.a;
                sb.append(new SimpleDateFormat("dd-HH_mm_ss", Locale.getDefault()).format(new Date()).toString());
                sb.append('/');
                File file = new File(sb.toString());
                Regex regex = com.vk.core.files.a.a;
                vhk0.b(file);
                file.mkdirs();
                FileWriter fileWriter = new FileWriter(new File(file, "report.txt"));
                try {
                    fileWriter.write(hti0.a());
                    fileWriter.close();
                    s3q0 s3q0Var = s3q0.a;
                    fileWriter.close();
                    Iterator it = j5g.u0(Collections.singletonList(hti0.c), j5g.u0(hti0.b, hti0.a)).iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            String str = (String) next;
                            com.vk.core.files.a.a(new File(str), new File(file, new File(str).getName()));
                        }
                    }
                    l370.L(file);
                    return Boolean.valueOf(vhk0.b(file));
                } finally {
                }
            default:
                com.vk.voip.ui.c.b.getClass();
                return Boolean.valueOf(((com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q()).a() && ((com.vk.voip.call_effects.a) com.vk.voip.ui.c.Q()).c());
        }
    }
}
