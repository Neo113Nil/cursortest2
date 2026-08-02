package xsna;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import com.google.android.datatransport.Priority;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.core.files.a;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Set;
import xsna.lbf;
import xsna.oyg0;
import xsna.yl5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vff implements pcs, Preference.b, io.reactivex.rxjava3.core.a0, oyg0.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vff(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.b;
        uek uekVar = (uek) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        if (((Boolean) obj).booleanValue()) {
            wjy.a.getClass();
            uek b = wjy.b();
            asu0.a.getClass();
            asu0.n().submit(new li0(2, debugDevSettingsFragment, b));
        } else {
            wjy.a.getClass();
            uek b2 = wjy.b();
            asu0.a.getClass();
            asu0.n().submit(new js6(debugDevSettingsFragment, b2));
        }
        if (uekVar.a()) {
            preference.J("Network: NetLog: start");
            return true;
        }
        preference.J("Network: NetLog: stop");
        return true;
    }

    @Override // xsna.oyg0.a
    public Object apply(Object obj) {
        oyg0 oyg0Var = (oyg0) this.b;
        eo5 eo5Var = (eo5) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        o0q o0qVar = oyg0Var.e;
        ArrayList s = oyg0Var.s(sQLiteDatabase, eo5Var, o0qVar.c());
        for (Priority priority : Priority.values()) {
            if (priority != eo5Var.c) {
                int c = o0qVar.c() - s.size();
                if (c <= 0) {
                    break;
                }
                s.addAll(oyg0Var.s(sQLiteDatabase, eo5Var.e(priority), c));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < s.size(); i++) {
            sb.append(((oy90) s.get(i)).b());
            if (i < s.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new oyg0.b(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = s.listIterator();
        while (listIterator.hasNext()) {
            oy90 oy90Var = (oy90) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(oy90Var.b()))) {
                yl5.a m = oy90Var.a().m();
                for (oyg0.b bVar : (Set) hashMap.get(Long.valueOf(oy90Var.b()))) {
                    m.a(bVar.a, bVar.b);
                }
                listIterator.set(new nn5(oy90Var.b(), oy90Var.c(), m.b()));
            }
        }
        return s;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        ClipsUploadFragmentImpl clipsUploadFragmentImpl = (ClipsUploadFragmentImpl) this.b;
        hjf hjfVar = (hjf) this.c;
        String str2 = ClipsUploadFragmentImpl.a0;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("geo_bundle", ClipsLinkAttachment.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("geo_bundle");
            if (!(parcelable3 instanceof ClipsLinkAttachment)) {
                parcelable3 = null;
            }
            parcelable = (ClipsLinkAttachment) parcelable3;
        }
        ClipsLinkAttachment clipsLinkAttachment = (ClipsLinkAttachment) parcelable;
        if (clipsLinkAttachment != null) {
            hjfVar.b(new lbf.c.k.C3254c(clipsLinkAttachment));
        }
        clipsUploadFragmentImpl.getChildFragmentManager().f("geo_result");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x007c, TryCatch #1 {all -> 0x007c, blocks: (B:3:0x0013, B:4:0x001f, B:6:0x0026, B:8:0x002d, B:11:0x0031, B:17:0x0043, B:29:0x004b, B:30:0x0058), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    @Override // io.reactivex.rxjava3.core.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        InputStream openInputStream;
        String d;
        String c;
        boolean z;
        File e;
        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        Uri uri = (Uri) this.c;
        File p = com.vk.core.files.a.p();
        FileOutputStream fileOutputStream = new FileOutputStream(p);
        boolean z2 = false;
        try {
            try {
                openInputStream = fragmentActivity.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = openInputStream.read(bArr, 0, 1024);
                    if (read == -1 || yVar.h()) {
                        break;
                    } else {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                d = tax.d(p);
                c = tax.c(p);
            } finally {
                a.c.a(null);
                a.c.a(fileOutputStream);
            }
        } catch (Throwable unused) {
            vhk0.b(p);
        }
        if (c == null && d == null) {
            z = false;
            if (c == null) {
                e = tax.e(p, c);
            } else {
                if (d == null) {
                    yVar.onError(new IOException("Not an media " + p.getName()));
                    a.c.a(openInputStream);
                    a.c.a(fileOutputStream);
                    return;
                }
                e = tax.e(p, d);
            }
            p = e;
            a.c.a(openInputStream);
            a.c.a(fileOutputStream);
            z2 = z;
            if (!z2 && p.length() > 0) {
                yVar.onSuccess(p);
                return;
            }
            yVar.onError(new Exception("Can't resolve this file " + p.getName()));
        }
        z = true;
        if (c == null) {
        }
        p = e;
        a.c.a(openInputStream);
        a.c.a(fileOutputStream);
        z2 = z;
        if (!z2) {
        }
        yVar.onError(new Exception("Can't resolve this file " + p.getName()));
    }
}
