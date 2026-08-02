package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
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

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes11.dex */
public final class lin0 extends MenuInflater {
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
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public i40 z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, lin0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.y;
            lin0 lin0Var = lin0.this;
            if (str != null) {
                if (lin0Var.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (lin0Var.d == null) {
                    lin0Var.d = lin0.a(lin0Var.c);
                }
                Object obj = lin0Var.d;
                String str2 = this.y;
                a aVar = new a();
                aVar.b = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.c = cls.getMethod(str2, a.d);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e) {
                    StringBuilder a = t33.a("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    a.append(cls.getName());
                    InflateException inflateException = new InflateException(a.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.h) {
                    ((androidx.appcompat.view.menu.h) menuItem).f(true);
                } else if (menuItem instanceof t720) {
                    ((t720) menuItem).h();
                }
            }
            String str3 = this.x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, lin0.e, lin0Var.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            i40 i40Var = this.z;
            if (i40Var != null && (menuItem instanceof nin0)) {
                ((nin0) menuItem).c(i40Var);
            }
            n720.a(menuItem, this.A);
            CharSequence charSequence = this.B;
            boolean z2 = menuItem instanceof nin0;
            if (z2) {
                ((nin0) menuItem).setTooltipText(charSequence);
            } else {
                menuItem.setTooltipText(charSequence);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((nin0) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((nin0) menuItem).setNumericShortcut(c2, i4);
            } else {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((nin0) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                n720.b(menuItem, colorStateList);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public lin0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return obj instanceof Activity ? obj : obj instanceof ContextWrapper ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
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
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    } else if (name2.equals("group")) {
                        bVar.b = 0;
                        bVar.c = 0;
                        bVar.d = 0;
                        bVar.e = 0;
                        bVar.f = true;
                        bVar.g = true;
                    } else if (name2.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                        if (!bVar.h) {
                            i40 i40Var = bVar.z;
                            if (i40Var == null || !i40Var.a()) {
                                bVar.h = true;
                                bVar.b(bVar.a.add(bVar.b, bVar.i, bVar.j, bVar.k));
                            } else {
                                bVar.h = true;
                                bVar.b(bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                            }
                        }
                    } else if (name2.equals("menu")) {
                        xmlPullParser2 = xmlPullParser;
                        z = true;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = this.c.obtainStyledAttributes(attributeSet, R$styleable.p);
                        bVar.b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar.c = obtainStyledAttributes.getInt(3, 0);
                        bVar.d = obtainStyledAttributes.getInt(4, 0);
                        bVar.e = obtainStyledAttributes.getInt(5, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(i, true);
                        bVar.g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                            int[] iArr = R$styleable.q;
                            Context context = this.c;
                            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr);
                            bVar.i = obtainStyledAttributes2.getResourceId(i, 0);
                            bVar.j = (obtainStyledAttributes2.getInt(6, bVar.d) & MinElf.PN_XNUM) | (obtainStyledAttributes2.getInt(5, bVar.c) & (-65536));
                            bVar.k = obtainStyledAttributes2.getText(7);
                            bVar.l = obtainStyledAttributes2.getText(8);
                            bVar.m = obtainStyledAttributes2.getResourceId(0, 0);
                            String string = obtainStyledAttributes2.getString(9);
                            bVar.n = string == null ? (char) 0 : string.charAt(0);
                            bVar.o = obtainStyledAttributes2.getInt(16, 4096);
                            String string2 = obtainStyledAttributes2.getString(10);
                            bVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                            bVar.q = obtainStyledAttributes2.getInt(20, 4096);
                            if (obtainStyledAttributes2.hasValue(11)) {
                                bVar.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                bVar.r = bVar.e;
                            }
                            bVar.s = obtainStyledAttributes2.getBoolean(3, false);
                            bVar.t = obtainStyledAttributes2.getBoolean(4, bVar.f);
                            bVar.u = obtainStyledAttributes2.getBoolean(1, bVar.g);
                            bVar.v = obtainStyledAttributes2.getInt(21, -1);
                            bVar.y = obtainStyledAttributes2.getString(12);
                            bVar.w = obtainStyledAttributes2.getResourceId(13, 0);
                            bVar.x = obtainStyledAttributes2.getString(15);
                            String string3 = obtainStyledAttributes2.getString(14);
                            if (string3 != null && bVar.w == 0 && bVar.x == null) {
                                bVar.z = (i40) bVar.a(string3, f, this.b);
                            } else {
                                bVar.z = null;
                            }
                            bVar.A = obtainStyledAttributes2.getText(17);
                            bVar.B = obtainStyledAttributes2.getText(22);
                            if (obtainStyledAttributes2.hasValue(19)) {
                                bVar.D = rko.c(obtainStyledAttributes2.getInt(19, -1), bVar.D);
                            } else {
                                bVar.D = null;
                            }
                            if (obtainStyledAttributes2.hasValue(18)) {
                                if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = anj.b(resourceId, context)) == null) {
                                    colorStateList = obtainStyledAttributes2.getColorStateList(18);
                                }
                                bVar.C = colorStateList;
                            } else {
                                bVar.C = null;
                            }
                            obtainStyledAttributes2.recycle();
                            bVar.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            bVar.h = true;
                            SubMenu addSubMenu = bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                            bVar.b(addSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, addSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof kin0)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (!fVar.p) {
                        fVar.w();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((androidx.appcompat.view.menu.f) menu).v();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((androidx.appcompat.view.menu.f) menu).v();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
