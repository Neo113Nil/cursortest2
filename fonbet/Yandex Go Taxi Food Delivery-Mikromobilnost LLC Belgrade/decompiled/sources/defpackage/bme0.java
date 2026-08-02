package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class bme0 {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final fme0 c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + Extension.DOT_CHAR, SwitchPreference.class.getPackage().getName() + Extension.DOT_CHAR};

    public bme0(Context context, fme0 fme0Var) {
        this.a = context;
        this.c = fme0Var;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        HashMap hashMap = f;
        Constructor<?> constructor = (Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.preference.Preference, androidx.preference.PreferenceGroup] */
    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceScreen preferenceScreen) {
        int next;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e2) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + Extension.COLON_SPACE + e2.getMessage());
                            inflateException.initCause(e2);
                            throw inflateException;
                        }
                    } catch (InflateException e3) {
                        throw e3;
                    }
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            ?? r2 = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
            if (preferenceScreen == null) {
                r2.l(this.c);
                preferenceScreen = r2;
            }
            d(xmlResourceParser, preferenceScreen, asAttributeSet);
        }
        return preferenceScreen;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        long j;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.E = Intent.parseIntent(this.a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    this.a.getResources().parseBundleExtra("extra", attributeSet, preference.d());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.j0.contains(b)) {
                        if (b.D != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.d0;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = b.D;
                            if (preferenceGroup2.A(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i = b.y;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.k0) {
                                int i2 = preferenceGroup.l0;
                                preferenceGroup.l0 = i2 + 1;
                                if (i2 != i) {
                                    b.y = i2;
                                    ame0 ame0Var = b.b0;
                                    if (ame0Var != null) {
                                        Handler handler = ame0Var.x;
                                        ii30 ii30Var = ame0Var.y;
                                        handler.removeCallbacks(ii30Var);
                                        handler.post(ii30Var);
                                    }
                                }
                            }
                            if (b instanceof PreferenceGroup) {
                                ((PreferenceGroup) b).k0 = preferenceGroup.k0;
                            }
                        }
                        int binarySearch = Collections.binarySearch(preferenceGroup.j0, b);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * (-1)) - 1;
                        }
                        boolean y = preferenceGroup.y();
                        if (b.O == y) {
                            b.O = !y;
                            b.j(b.y());
                            b.i();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.j0.add(binarySearch, b);
                        }
                        fme0 fme0Var = preferenceGroup.b;
                        String str2 = b.D;
                        if (str2 == null || !preferenceGroup.i0.containsKey(str2)) {
                            synchronized (fme0Var) {
                                j = fme0Var.b;
                                fme0Var.b = 1 + j;
                            }
                        } else {
                            j = ((Long) preferenceGroup.i0.get(str2)).longValue();
                            preferenceGroup.i0.remove(str2);
                        }
                        b.c = j;
                        b.w = true;
                        try {
                            b.l(fme0Var);
                            b.w = false;
                            if (b.d0 != null) {
                                ny61.r("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                                return;
                            }
                            b.d0 = preferenceGroup;
                            if (preferenceGroup.m0) {
                                b.k();
                            }
                            ame0 ame0Var2 = preferenceGroup.b0;
                            if (ame0Var2 != null) {
                                Handler handler2 = ame0Var2.x;
                                ii30 ii30Var2 = ame0Var2.y;
                                handler2.removeCallbacks(ii30Var2);
                                handler2.post(ii30Var2);
                            }
                        } catch (Throwable th) {
                            b.w = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, b, attributeSet);
                }
            }
        }
    }
}
