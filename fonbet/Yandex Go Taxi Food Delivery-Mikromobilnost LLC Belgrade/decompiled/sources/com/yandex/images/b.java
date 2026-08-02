package com.yandex.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.ImageView;
import defpackage.abe;
import defpackage.abv;
import defpackage.ad7;
import defpackage.b2z;
import defpackage.bbv;
import defpackage.bl7;
import defpackage.cbv;
import defpackage.g9v;
import defpackage.gfv;
import defpackage.hdh;
import defpackage.ht10;
import defpackage.i30;
import defpackage.kav;
import defpackage.un7;
import defpackage.uz;
import defpackage.v06;
import defpackage.w3i;
import defpackage.xav;
import defpackage.y9v;
import defpackage.ych;
import defpackage.yn50;
import defpackage.z83;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class b implements xav {
    public final Handler a;
    public final w3i b;
    public final a c;
    public final un7 d;
    public final y9v e;
    public final ExecutorService f;
    public final ReferenceQueue g;
    public final Map h;

    public b(Context context, abe abeVar, ExecutorService executorService, y9v y9vVar, hdh hdhVar, w3i w3iVar) {
        ReferenceQueue referenceQueue = new ReferenceQueue();
        this.g = referenceQueue;
        this.h = Collections.synchronizedMap(new WeakHashMap());
        this.f = executorService;
        Handler handler = new Handler(this) { // from class: com.yandex.images.ImageManagerImpl$ImagesHandler
            private final b mImageManager;

            {
                super(Looper.getMainLooper());
                this.mImageManager = this;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i;
                int i2 = message.what;
                int i3 = 0;
                if (i2 == 2) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bl7 bl7Var = (bl7) list.get(i4);
                        b bVar = bl7Var.a;
                        bVar.getClass();
                        ad7 d = bVar.b.d(bl7Var.b, true);
                        if (d == null) {
                            bVar.j(bl7Var);
                        } else if (!bl7Var.e) {
                            bl7Var.b(d);
                        }
                    }
                    return;
                }
                if (i2 == 3) {
                    bl7 bl7Var2 = (bl7) message.obj;
                    bl7Var2.a.h(bl7Var2.d());
                    return;
                }
                if (i2 != 10) {
                    if (i2 == 12) {
                        ((bl7) message.obj).c(kav.b);
                        return;
                    }
                    z83.j("Unknown handler message received: " + message.what);
                    return;
                }
                List list2 = (List) message.obj;
                int size2 = list2.size();
                int i5 = 0;
                while (i5 < size2) {
                    v06 v06Var = (v06) list2.get(i5);
                    b bVar2 = this.mImageManager;
                    bVar2.getClass();
                    List unmodifiableList = Collections.unmodifiableList(v06Var.y);
                    List list3 = unmodifiableList;
                    if (list3 == null || list3.isEmpty()) {
                        i = i5;
                    } else {
                        ht10 ht10Var = v06Var.z;
                        Bitmap bitmap = ht10Var != null ? (Bitmap) ht10Var.b : null;
                        ImageManager$From imageManager$From = v06Var.E;
                        Uri uri = v06Var.F;
                        un7 un7Var = bVar2.d;
                        uz uzVar = (uz) un7Var.z;
                        Handler handler2 = (Handler) un7Var.x;
                        int i6 = un7Var.a;
                        i = i5;
                        if (i6 < 0) {
                            handler2.postDelayed(uzVar, 300L);
                            un7Var.a = i3;
                            un7Var.c = true;
                        } else {
                            if (imageManager$From == ImageManager$From.NETWORK) {
                                un7Var.a = i6 + 1;
                            }
                            if (un7Var.c) {
                                un7Var.b = true;
                            } else if (un7Var.a >= 10) {
                                handler2.postDelayed(uzVar, 300L);
                                un7Var.c = true;
                            }
                        }
                        if (bitmap != null) {
                            b.i(unmodifiableList, new ad7(bitmap, null, uri, imageManager$From));
                        } else {
                            bVar2.f.submit(new bbv(bVar2, v06Var, unmodifiableList, uri, imageManager$From));
                        }
                    }
                    i5 = i + 1;
                    i3 = 0;
                }
            }
        };
        this.a = handler;
        this.b = w3iVar;
        this.c = new a(context, abeVar, hdhVar, w3iVar, handler, new gfv(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new i30(3)));
        this.d = new un7(w3iVar, handler, executorService);
        this.e = y9vVar;
        new cbv(referenceQueue, handler).start();
    }

    public static void i(List list, ad7 ad7Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bl7 bl7Var = (bl7) list.get(i);
            if (!bl7Var.e) {
                bl7Var.b(ad7Var);
            }
        }
    }

    @Override // defpackage.xav
    public final void a() {
        ArrayList arrayList;
        synchronized (this.h) {
            arrayList = new ArrayList(this.h.values());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            h(((bl7) arrayList.get(i)).d());
        }
    }

    @Override // defpackage.xav
    public final void b(String str, String str2) {
        this.f.execute(new abv(this, str, str2, 1));
    }

    @Override // defpackage.xav
    public final void c(ImageView imageView) {
        h(imageView);
    }

    @Override // defpackage.xav
    public final void d() {
        ((b2z) this.b.w).a();
    }

    @Override // defpackage.xav
    public final void e(Bitmap bitmap, String str) {
        this.f.execute(new abv(this, str, bitmap, 0));
    }

    @Override // defpackage.xav
    public final void f(String str) {
        ArrayList arrayList;
        synchronized (this.h) {
            arrayList = new ArrayList(this.h.values());
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bl7 bl7Var = (bl7) arrayList.get(i);
            bl7Var.getClass();
            if (TextUtils.equals(null, str)) {
                h(bl7Var.d());
            }
        }
    }

    @Override // defpackage.xav
    public final Future g() {
        w3i w3iVar = this.b;
        ((b2z) w3iVar.w).a();
        return this.f.submit(new ych(w3iVar, 0), null);
    }

    public final void h(Object obj) {
        bl7 bl7Var = (bl7) this.h.remove(obj);
        if (bl7Var != null) {
            bl7Var.a();
            Handler handler = this.c.f;
            handler.sendMessage(handler.obtainMessage(1, bl7Var));
        }
    }

    public final void j(bl7 bl7Var) {
        Object d = bl7Var.d();
        if (d != null) {
            Map map = this.h;
            if (map.get(d) != bl7Var) {
                h(d);
                map.put(d, bl7Var);
            }
        }
        Handler handler = this.c.f;
        handler.sendMessage(handler.obtainMessage(0, bl7Var));
    }

    @Override // defpackage.xav
    public final g9v load(String str) {
        return new yn50(str, this);
    }
}
