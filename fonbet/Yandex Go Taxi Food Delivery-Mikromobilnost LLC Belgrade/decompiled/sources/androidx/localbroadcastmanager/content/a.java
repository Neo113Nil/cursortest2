package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.c2z;
import defpackage.c9v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {
    public static final Object f = new Object();
    public static a g;
    public final Context a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayList d = new ArrayList();
    public final Handler e;

    public a(Context context) {
        this.a = context;
        final Looper mainLooper = context.getMainLooper();
        this.e = new Handler(mainLooper) { // from class: androidx.localbroadcastmanager.content.LocalBroadcastManager$1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int size;
                c9v[] c9vVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                a aVar = a.this;
                while (true) {
                    synchronized (aVar.b) {
                        try {
                            size = aVar.d.size();
                            if (size <= 0) {
                                return;
                            }
                            c9vVarArr = new c9v[size];
                            aVar.d.toArray(c9vVarArr);
                            aVar.d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i = 0; i < size; i++) {
                        c9v c9vVar = c9vVarArr[i];
                        int size2 = ((ArrayList) c9vVar.c).size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            c2z c2zVar = (c2z) ((ArrayList) c9vVar.c).get(i2);
                            if (!c2zVar.d) {
                                c2zVar.b.onReceive(aVar.a, (Intent) c9vVar.b);
                            }
                        }
                    }
                }
            }
        };
    }

    public static a a(Context context) {
        a aVar;
        synchronized (f) {
            try {
                if (g == null) {
                    g = new a(context.getApplicationContext());
                }
                aVar = g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.b) {
            try {
                c2z c2zVar = new c2z(broadcastReceiver, intentFilter);
                ArrayList arrayList = (ArrayList) this.b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(c2zVar);
                for (int i = 0; i < intentFilter.countActions(); i++) {
                    String action = intentFilter.getAction(i);
                    ArrayList arrayList2 = (ArrayList) this.c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.c.put(action, arrayList2);
                    }
                    arrayList2.add(c2zVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Intent intent) {
        int match;
        synchronized (this.b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z = (intent.getFlags() & 8) != 0;
                if (z) {
                    intent.toString();
                }
                ArrayList arrayList = (ArrayList) this.c.get(intent.getAction());
                if (arrayList != null) {
                    if (z) {
                        arrayList.toString();
                    }
                    ArrayList arrayList2 = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        c2z c2zVar = (c2z) arrayList.get(i);
                        if (z) {
                            Objects.toString(c2zVar.a);
                        }
                        if (!c2zVar.c && (match = c2zVar.a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager")) >= 0) {
                            if (z) {
                                Integer.toHexString(match);
                            }
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(c2zVar);
                            c2zVar.c = true;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            ((c2z) arrayList2.get(i2)).c = false;
                        }
                        this.d.add(new c9v(13, intent, arrayList2));
                        if (!this.e.hasMessages(1)) {
                            this.e.sendEmptyMessage(1);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.b) {
            try {
                ArrayList arrayList = (ArrayList) this.b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c2z c2zVar = (c2z) arrayList.get(size);
                    c2zVar.d = true;
                    for (int i = 0; i < c2zVar.a.countActions(); i++) {
                        String action = c2zVar.a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) this.c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c2z c2zVar2 = (c2z) arrayList2.get(size2);
                                if (c2zVar2.b == broadcastReceiver) {
                                    c2zVar2.d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
