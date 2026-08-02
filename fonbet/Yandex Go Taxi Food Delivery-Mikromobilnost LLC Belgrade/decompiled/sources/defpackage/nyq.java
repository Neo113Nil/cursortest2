package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.sequences.b;
import ru.CryptoPro.JCP.tools.HexString;

/* loaded from: classes10.dex */
public final class nyq {
    public static final wly0 d = new wly0();
    public static volatile nyq e;
    public final File a;
    public final String b;
    public final Object c = new Object();

    public nyq(Context context) {
        long j;
        StringBuilder sb = new StringBuilder();
        int i = Build.VERSION.SDK_INT;
        sb.append(i);
        sb.append('_');
        sb.append(Build.TIME);
        String sb2 = sb.toString();
        try {
            j = i >= 33 ? rh.d(context) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            j = 1;
        }
        this.b = sb2 + '.' + j;
        Context context2 = context.isDeviceProtectedStorage() ? context : null;
        File file = new File(((context2 == null && (context2 = context.createDeviceProtectedStorageContext()) == null) ? context : context2).getCacheDir(), "emoji_picker");
        this.a = file;
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    public static ArrayList a(File file) {
        List W;
        if (!file.isFile()) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), uza.a), 8192);
        try {
            List s = b.s(new a7e(new i73(4, bufferedReader)));
            bufferedReader.close();
            List list = s;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                W = evu0.W((String) it.next(), new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                arrayList.add(W);
            }
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List list2 = (List) it2.next();
                arrayList2.add(new tun((String) a.P(list2), a.J(list2, 1)));
            }
            return arrayList2;
        } finally {
        }
    }

    public static List b(File file, p61 p61Var) {
        List<tun> list = (List) p61Var.invoke();
        if (file.exists() && !file.delete()) {
            Log.wtf("emojipicker.FileCache", "Can't delete file: " + file);
        }
        if (!file.createNewFile()) {
            ny61.v(g8e.n(file, "Can't create file: "));
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), uza.a), 8192);
        try {
            for (tun tunVar : list) {
                bufferedWriter.write(tunVar.a);
                Iterator it = tunVar.b.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write(HexString.CHAR_COMMA + ((String) it.next()));
                }
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return list;
        } finally {
        }
    }
}
