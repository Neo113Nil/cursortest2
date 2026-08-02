package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R$styleable;
import com.facebook.soloader.MinElf;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.min0.b;
import xsna.wyo0;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes7.dex */
public class min0<MS extends b> extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    /* compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] d = {MenuItem.class};
        public Object b;
        public Method c;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.b;
            Method method = this.c;
            try {
                if (method.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater.java */
    public class b {
        public final Menu a;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public char o;
        public int p;
        public boolean q;
        public boolean r;
        public boolean s;
        public int t;
        public int u;
        public String v;
        public String w;
        public i40 x;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = min0.this.c.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s).setCheckable(this.p >= 1).setTitleCondensed(this.l).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
            wyo0.a aVar = (wyo0.a) this;
            int i = aVar.m;
            if (i == 0 || aVar.z == null) {
                menuItem.setIcon(i);
            } else {
                dhr0.a.getClass();
                menuItem.setIcon(new baf0(m33.a(aVar.m, dhr0.E()), aVar.z));
            }
            ColorStateList colorStateList = aVar.z;
            if (colorStateList != null) {
                n720.b(menuItem, colorStateList);
            }
            int i2 = this.t;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            String str = this.w;
            min0 min0Var = min0.this;
            if (str != null) {
                if (min0Var.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (min0Var.d == null) {
                    min0Var.d = min0.a(min0Var.c);
                }
                Object obj = min0Var.d;
                String str2 = this.w;
                a aVar2 = new a();
                aVar2.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar2.c = cls.getMethod(str2, a.d);
                    menuItem.setOnMenuItemClickListener(aVar2);
                } catch (Exception e) {
                    StringBuilder a = t33.a("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    a.append(cls.getName());
                    InflateException inflateException = new InflateException(a.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            boolean z2 = menuItem instanceof androidx.appcompat.view.menu.h;
            if (z2) {
            }
            if (this.p >= 2) {
                if (z2) {
                    ((androidx.appcompat.view.menu.h) menuItem).f(true);
                } else if (menuItem instanceof t720) {
                    ((t720) menuItem).h();
                }
            }
            String str3 = this.v;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, min0.e, min0Var.a));
                z = true;
            }
            int i3 = this.u;
            if (i3 > 0 && !z) {
                menuItem.setActionView(i3);
            }
            i40 i40Var = this.x;
            if (i40Var == null || !(menuItem instanceof nin0)) {
                return;
            }
            ((nin0) menuItem).c(i40Var);
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public min0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Finally extract failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        wyo0.a aVar = new wyo0.a(menu);
        String str = null;
        aVar.z = null;
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str2)) {
                        xmlPullParser2 = xmlPullParser;
                        str2 = str;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        aVar.b = 0;
                        aVar.c = 0;
                        aVar.d = 0;
                        aVar.e = 0;
                        aVar.f = true;
                        aVar.g = true;
                    } else if (name2.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                        if (!aVar.h) {
                            i40 i40Var = aVar.x;
                            if (i40Var == null || !i40Var.a()) {
                                aVar.h = true;
                                aVar.b(aVar.a.add(aVar.b, aVar.i, aVar.j, aVar.k));
                            } else {
                                aVar.h = true;
                                aVar.b(aVar.a.addSubMenu(aVar.b, aVar.i, aVar.j, aVar.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                    eventType = xmlPullParser2.next();
                    i = 2;
                    z = z;
                    z2 = z2;
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean equals = name3.equals("group");
                    min0 min0Var = min0.this;
                    if (equals) {
                        TypedArray obtainStyledAttributes = min0Var.c.obtainStyledAttributes(attributeSet, R$styleable.p);
                        aVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        aVar.c = obtainStyledAttributes.getInt(3, 0);
                        aVar.d = obtainStyledAttributes.getInt(4, 0);
                        aVar.e = obtainStyledAttributes.getInt(5, 0);
                        aVar.f = obtainStyledAttributes.getBoolean(2, true);
                        aVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        xmlPullParser2 = xmlPullParser;
                        str = null;
                    } else if (name3.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                        TypedArray obtainStyledAttributes2 = min0Var.c.obtainStyledAttributes(attributeSet, R$styleable.q);
                        aVar.i = obtainStyledAttributes2.getResourceId(2, 0);
                        aVar.j = (obtainStyledAttributes2.getInt(5, aVar.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, aVar.d) & MinElf.PN_XNUM);
                        aVar.k = obtainStyledAttributes2.getText(7);
                        aVar.l = obtainStyledAttributes2.getText(8);
                        aVar.m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        aVar.n = string == null ? (char) 0 : string.charAt(0);
                        String string2 = obtainStyledAttributes2.getString(10);
                        aVar.o = string2 == null ? (char) 0 : string2.charAt(0);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            aVar.p = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            aVar.p = aVar.e;
                        }
                        aVar.q = obtainStyledAttributes2.getBoolean(3, false);
                        aVar.r = obtainStyledAttributes2.getBoolean(4, aVar.f);
                        aVar.s = obtainStyledAttributes2.getBoolean(1, aVar.g);
                        aVar.t = obtainStyledAttributes2.getInt(21, -1);
                        aVar.w = obtainStyledAttributes2.getString(12);
                        aVar.u = obtainStyledAttributes2.getResourceId(13, 0);
                        aVar.v = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null && aVar.u == 0 && aVar.v == null) {
                            aVar.x = (i40) aVar.a(string3, f, min0Var.b);
                            str = null;
                        } else {
                            str = null;
                            aVar.x = null;
                        }
                        obtainStyledAttributes2.recycle();
                        aVar.h = false;
                        dhr0.a.getClass();
                        TypedArray obtainStyledAttributes3 = dhr0.E().obtainStyledAttributes(attributeSet, wyo0.g);
                        try {
                            aVar.z = obtainStyledAttributes3.getColorStateList(0);
                            obtainStyledAttributes3.recycle();
                        } catch (Throwable th) {
                            obtainStyledAttributes3.recycle();
                            throw th;
                        }
                    } else {
                        str = null;
                        if (name3.equals("menu")) {
                            aVar.h = true;
                            SubMenu addSubMenu = aVar.a.addSubMenu(aVar.b, aVar.i, aVar.j, aVar.k);
                            aVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str2 = name3;
                            z2 = true;
                        }
                    }
                    eventType = xmlPullParser2.next();
                    i = 2;
                    z = z;
                    z2 = z2;
                }
                xmlPullParser2 = xmlPullParser;
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof kin0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
