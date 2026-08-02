package com.pichillilorenzo.flutter_inappwebview_android;

import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.yandex.div.state.db.StateEntry;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.hm91;
import defpackage.oyr;
import defpackage.qrb1;
import defpackage.unr0;
import defpackage.x920;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes11.dex */
public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                if (e.getMessage() == null || !e.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    throw e;
                }
                return null;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final da20 da20Var) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            da20Var.success(Boolean.FALSE);
        } else {
            cookieManager2.removeAllCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    da20Var.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final da20 da20Var) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            da20Var.success(Boolean.FALSE);
            return;
        }
        String o = unr0.o(str2, "=; Path=", str4, "; Max-Age=-1");
        if (str3 != null) {
            o = g8e.p(o, "; Domain=", str3);
        }
        cookieManager.setCookie(str, o.concat(";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.2
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool) {
                da20Var.success(bool);
            }
        });
        cookieManager.flush();
    }

    public void deleteCookies(String str, String str2, String str3, da20 da20Var) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            da20Var.success(Boolean.FALSE);
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            for (String str4 : cookie.split(";")) {
                String o = unr0.o(str4.split("=", 2)[0].trim(), "=; Path=", str3, "; Max-Age=-1");
                if (str2 != null) {
                    o = g8e.p(o, "; Domain=", str2);
                }
                cookieManager.setCookie(str, o.concat(";"), null);
            }
            cookieManager.flush();
        }
        da20Var.success(Boolean.TRUE);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            List arrayList2 = new ArrayList();
            String str3 = "GET_COOKIE_INFO";
            String str4 = ";";
            if (hm91.d("GET_COOKIE_INFO")) {
                arrayList2 = qrb1.d(cookieManager, str);
            } else {
                String cookie = cookieManager.getCookie(str);
                if (cookie != null) {
                    arrayList2 = Arrays.asList(cookie.split(";"));
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String[] split = ((String) it.next()).split(str4);
                if (split.length != 0) {
                    String[] split2 = split[0].split("=", 2);
                    HashMap u = g8e.u("name", split2[0].trim(), "value", split2.length > 1 ? split2[1].trim() : "");
                    u.put("expiresDate", null);
                    u.put("isSessionOnly", null);
                    u.put("domain", null);
                    u.put("sameSite", null);
                    u.put("isSecure", null);
                    u.put("isHttpOnly", null);
                    u.put(StateEntry.COLUMN_PATH, null);
                    if (hm91.d(str3)) {
                        Boolean bool = Boolean.FALSE;
                        u.put("isSecure", bool);
                        u.put("isHttpOnly", bool);
                        int i = 1;
                        while (i < split.length) {
                            Iterator it2 = it;
                            String[] split3 = split[i].split("=", 2);
                            String trim = split3[0].trim();
                            String str5 = str3;
                            String[] strArr = split;
                            String trim2 = split3.length > 1 ? split3[1].trim() : "";
                            if (trim.equalsIgnoreCase("Expires")) {
                                try {
                                    str2 = str4;
                                    try {
                                        Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(trim2);
                                        if (parse != null) {
                                            u.put("expiresDate", Long.valueOf(parse.getTime()));
                                        }
                                    } catch (ParseException e) {
                                        e = e;
                                        Log.e(LOG_TAG, "", e);
                                        i++;
                                        str3 = str5;
                                        it = it2;
                                        split = strArr;
                                        str4 = str2;
                                    }
                                } catch (ParseException e2) {
                                    e = e2;
                                    str2 = str4;
                                }
                            } else {
                                str2 = str4;
                                if (trim.equalsIgnoreCase("Max-Age")) {
                                    try {
                                        u.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(trim2)));
                                    } catch (NumberFormatException e3) {
                                        Log.e(LOG_TAG, "", e3);
                                    }
                                } else if (trim.equalsIgnoreCase("Domain")) {
                                    u.put("domain", trim2);
                                } else if (trim.equalsIgnoreCase("SameSite")) {
                                    u.put("sameSite", trim2);
                                } else if (trim.equalsIgnoreCase("Secure")) {
                                    u.put("isSecure", Boolean.TRUE);
                                } else if (trim.equalsIgnoreCase("HttpOnly")) {
                                    u.put("isHttpOnly", Boolean.TRUE);
                                } else if (trim.equalsIgnoreCase("Path")) {
                                    u.put(StateEntry.COLUMN_PATH, trim2);
                                }
                            }
                            i++;
                            str3 = str5;
                            it = it2;
                            split = strArr;
                            str4 = str2;
                        }
                    }
                    arrayList.add(u);
                    str3 = str3;
                    it = it;
                    str4 = str4;
                }
            }
        }
        return arrayList;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        init();
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "deleteCookie":
                deleteCookie((String) x920Var.a("url"), (String) x920Var.a("name"), (String) x920Var.a("domain"), (String) x920Var.a(StateEntry.COLUMN_PATH), da20Var);
                break;
            case "removeSessionCookies":
                removeSessionCookies(da20Var);
                break;
            case "setCookie":
                String str2 = (String) x920Var.a("url");
                String str3 = (String) x920Var.a("name");
                String str4 = (String) x920Var.a("value");
                String str5 = (String) x920Var.a("domain");
                String str6 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                String str7 = (String) x920Var.a("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) x920Var.a("maxAge"), (Boolean) x920Var.a("isSecure"), (Boolean) x920Var.a("isHttpOnly"), (String) x920Var.a("sameSite"), da20Var);
                break;
            case "deleteCookies":
                deleteCookies((String) x920Var.a("url"), (String) x920Var.a("domain"), (String) x920Var.a(StateEntry.COLUMN_PATH), da20Var);
                break;
            case "deleteAllCookies":
                deleteAllCookies(da20Var);
                break;
            case "getCookies":
                da20Var.success(getCookies((String) x920Var.a("url")));
                break;
            default:
                da20Var.notImplemented();
                break;
        }
    }

    public void removeSessionCookies(final da20 da20Var) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            da20Var.success(Boolean.FALSE);
        } else {
            cookieManager2.removeSessionCookies(new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.4
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Boolean bool) {
                    da20Var.success(bool);
                }
            });
            cookieManager.flush();
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final da20 da20Var) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            da20Var.success(Boolean.FALSE);
            return;
        }
        String q = oyr.q(str2, "=", str3, "; Path=", str5);
        if (str4 != null) {
            q = g8e.p(q, "; Domain=", str4);
        }
        if (l != null) {
            StringBuilder a = a.a(q, "; Expires=");
            a.append(getCookieExpirationDate(l));
            q = a.toString();
        }
        if (num != null) {
            StringBuilder a2 = a.a(q, "; Max-Age=");
            a2.append(num.toString());
            q = a2.toString();
        }
        if (bool != null && bool.booleanValue()) {
            q = q.concat("; Secure");
        }
        if (bool2 != null && bool2.booleanValue()) {
            q = q.concat("; HttpOnly");
        }
        if (str6 != null) {
            q = g8e.p(q, "; SameSite=", str6);
        }
        cookieManager.setCookie(str, q.concat(";"), new ValueCallback<Boolean>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyCookieManager.1
            @Override // android.webkit.ValueCallback
            public void onReceiveValue(Boolean bool3) {
                da20Var.success(bool3);
            }
        });
        cookieManager.flush();
    }
}
