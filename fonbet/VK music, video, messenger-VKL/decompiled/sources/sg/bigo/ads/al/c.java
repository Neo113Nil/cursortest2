package sg.bigo.ads.al;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import sg.bigo.ads.al.a;
import sg.bigo.ads.am.a;
import sg.bigo.ads.am.b;
import xsna.dok;
import xsna.eok;
import xsna.mok;

/* loaded from: classes9.dex */
public final class c {
    private static boolean a = true;

    public static void a(final Context context) {
        a(context, "", null, "warmup", new Runnable() { // from class: sg.bigo.ads.al.c.3
            @Override // java.lang.Runnable
            public final void run() {
                b a2 = b.a();
                Context context2 = context;
                if (context2 != null) {
                    a2.a(context2.getApplicationContext());
                }
            }
        });
    }

    public static void a(final Context context, final String str, final int i, final int i2, final boolean z, final Bitmap bitmap, final a.c cVar, final a.b bVar) {
        a(context, str, bVar, "open", new Runnable() { // from class: sg.bigo.ads.al.c.2
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri;
                final b a2 = b.a();
                Context context2 = context;
                final String str2 = str;
                int i3 = i;
                int i4 = i2;
                boolean z2 = z;
                Bitmap bitmap2 = bitmap;
                final a.c cVar2 = cVar;
                final a.b bVar2 = bVar;
                if (!TextUtils.isEmpty(str2)) {
                    a2.b.remove(str2);
                }
                Thread.currentThread().getName();
                try {
                    uri = Uri.parse(str2);
                } catch (Exception unused) {
                    uri = null;
                }
                if (uri == null) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Stop open chrome tab with error url.");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                a2.a(context2);
                a2.a.d = new eok() { // from class: sg.bigo.ads.al.b.1
                    @Override // xsna.eok
                    public final void onNavigationEvent(int i5, Bundle bundle) {
                        super.onNavigationEvent(i5, bundle);
                        if (cVar2 == null) {
                            return;
                        }
                        b.a(i5);
                        if (i5 == 5) {
                            cVar2.a();
                            return;
                        }
                        if (i5 == 1) {
                            cVar2.b();
                            return;
                        }
                        if (i5 == 3) {
                            cVar2.d();
                            return;
                        }
                        if (i5 == 4) {
                            cVar2.c();
                            return;
                        }
                        if (i5 == 2) {
                            cVar2.e();
                        } else if (i5 == 6) {
                            cVar2.f();
                            b.this.a.d = null;
                        }
                    }
                };
                mok.a aVar = new mok.a(a2.a.a());
                dok dokVar = aVar.b;
                if (i3 != 0) {
                    dokVar.a = Integer.valueOf(i3 | (-16777216));
                }
                if (i4 != 0) {
                    dokVar.b = Integer.valueOf(i4);
                }
                Intent intent = aVar.a;
                if (bitmap2 != null) {
                    intent.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap2);
                }
                intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z2 ? 1 : 0);
                mok a3 = aVar.a();
                Intent intent2 = a3.a;
                try {
                    Context b = sg.bigo.ads.at.b.b();
                    if (b == null) {
                        b = context2;
                    }
                    a.b bVar3 = new a.b() { // from class: sg.bigo.ads.al.b.2
                        @Override // sg.bigo.ads.am.a.b
                        public final void a(Context context3, b.a aVar2) {
                            a.b bVar4 = bVar2;
                            if (bVar4 != null) {
                                bVar4.a(context3, str2, 2, aVar2 == null ? "" : aVar2.b);
                            }
                        }

                        @Override // sg.bigo.ads.am.a.b
                        public final void a(b.a aVar2) {
                            a.b bVar4 = bVar2;
                            if (bVar4 == null || aVar2 == null) {
                                return;
                            }
                            bVar4.a(aVar2.e, aVar2.d, aVar2.c);
                        }
                    };
                    b.a a4 = sg.bigo.ads.am.b.a(b);
                    if (a4 != null && a4.a) {
                        intent2.setPackage(a4.e);
                        intent2.setData(uri);
                        b.startActivity(intent2, a3.b);
                        bVar3.a(a4);
                    }
                    bVar3.a(b, a4);
                } catch (Exception e) {
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 4, e.toString());
                    }
                    a2.a.d = null;
                }
            }
        });
    }

    public static void a(final Context context, final String str, final a.b bVar) {
        a(context, str, bVar, "preload", new Runnable() { // from class: sg.bigo.ads.al.c.1
            @Override // java.lang.Runnable
            public final void run() {
                b a2 = b.a();
                Context context2 = context;
                String str2 = str;
                a.b bVar2 = bVar;
                Thread.currentThread().getName();
                if (context2 == null) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Preload: empty context!");
                    if (bVar2 != null) {
                        bVar2.a(context2, str2, 3, "Invalid context");
                        return;
                    }
                    return;
                }
                Context applicationContext = context2.getApplicationContext();
                if (TextUtils.isEmpty(str2)) {
                    sg.bigo.ads.bn.a.a(0, "ChromeTabsStatic", "Preload: empty url!");
                    if (bVar2 != null) {
                        bVar2.a(applicationContext, str2, 3, "Invalid url");
                        return;
                    }
                    return;
                }
                a2.b.add(str2);
                if (a2.a(applicationContext)) {
                    a2.b();
                    if (bVar2 != null) {
                        bVar2.a("", "0", "");
                        return;
                    }
                    return;
                }
                a2.b.remove(str2);
                if (bVar2 != null) {
                    bVar2.a(applicationContext, str2, 2, "Failed to make connection of Chrome service.");
                }
            }
        });
    }

    private static void a(@Nullable Context context, String str, @Nullable a.b bVar, String str2, Runnable runnable) {
        if (!a) {
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, "NoClassDefFoundError");
            return;
        }
        try {
            runnable.run();
        } catch (NoClassDefFoundError e) {
            a = false;
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 1, e.toString());
        } catch (Throwable th) {
            th.toString();
            if (context == null || bVar == null) {
                return;
            }
            bVar.a(context, str, 4, th.toString());
        }
    }
}
