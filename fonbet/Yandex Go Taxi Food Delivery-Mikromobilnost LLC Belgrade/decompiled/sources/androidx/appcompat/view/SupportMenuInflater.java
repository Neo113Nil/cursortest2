package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.internal.view.SupportMenu;
import defpackage.kbs;
import defpackage.ny61;
import defpackage.unr0;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes10.dex */
public class SupportMenuInflater extends MenuInflater {
    static final Class<?>[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE;
    static final Class<?>[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
    static final String LOG_TAG = "SupportMenuInflater";
    static final int NO_ID = 0;
    private static final String XML_GROUP = "group";
    private static final String XML_ITEM = "item";
    private static final String XML_MENU = "menu";
    final Object[] mActionProviderConstructorArguments;
    final Object[] mActionViewConstructorArguments;
    Context mContext;
    private Object mRealOwner;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] PARAM_TYPES = {MenuItem.class};
        private Method mMethod;
        private Object mRealOwner;

        public InflatedOnMenuItemClickListener(Object obj, String str) {
            this.mRealOwner = obj;
            Class<?> cls = obj.getClass();
            try {
                this.mMethod = cls.getMethod(str, PARAM_TYPES);
            } catch (Exception e) {
                StringBuilder x = unr0.x("Couldn't resolve menu item onClick handler ", str, " in class ");
                x.append(cls.getName());
                InflateException inflateException = new InflateException(x.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                Class<?> returnType = this.mMethod.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Method method = this.mMethod;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(this.mRealOwner, menuItem)).booleanValue();
                }
                method.invoke(this.mRealOwner, menuItem);
                return true;
            } catch (Exception e) {
                ny61.j(e);
                return false;
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        ACTION_VIEW_CONSTRUCTOR_SIGNATURE = clsArr;
        ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.mContext = context;
        Object[] objArr = {context};
        this.mActionViewConstructorArguments = objArr;
        this.mActionProviderConstructorArguments = objArr;
    }

    private Object findRealOwner(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? findRealOwner(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r3 == 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r14 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        if (r3 == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r3 == 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0257, code lost:
    
        r3 = r4.next();
        r4 = 2;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r10 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r3.equals(r11) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r4 = r17;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r2.h != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        r3 = r2.z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007d, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r3.hasSubMenu() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        r2.h = true;
        r2.b(r14.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        r2.h = true;
        r2.b(r14.add(r2.b, r2.i, r2.j, r2.k));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        r4 = r17;
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
    
        if (r10 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
    
        r3 = r17.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_GROUP) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        r3 = r16.mContext.obtainStyledAttributes(r18, defpackage.n4i0.MenuGroup);
        r2.b = r3.getResourceId(defpackage.n4i0.MenuGroup_android_id, 0);
        r2.c = r3.getInt(defpackage.n4i0.MenuGroup_android_menuCategory, 0);
        r2.d = r3.getInt(defpackage.n4i0.MenuGroup_android_orderInCategory, 0);
        r2.e = r3.getInt(defpackage.n4i0.MenuGroup_android_checkableBehavior, 0);
        r2.f = r3.getBoolean(defpackage.n4i0.MenuGroup_android_visible, true);
        r2.g = r3.getBoolean(defpackage.n4i0.MenuGroup_android_enabled, true);
        r3.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0106, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_ITEM) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        r3 = defpackage.dfz0.f(r16.mContext, r18, defpackage.n4i0.MenuItem);
        r12 = defpackage.n4i0.MenuItem_android_id;
        r13 = r3.b;
        r2.i = r13.getResourceId(r12, 0);
        r2.j = (r13.getInt(defpackage.n4i0.MenuItem_android_menuCategory, r2.c) & (-65536)) | (r13.getInt(defpackage.n4i0.MenuItem_android_orderInCategory, r2.d) & 65535);
        r2.k = r13.getText(defpackage.n4i0.MenuItem_android_title);
        r2.l = r13.getText(defpackage.n4i0.MenuItem_android_titleCondensed);
        r2.m = r13.getResourceId(defpackage.n4i0.MenuItem_android_icon, 0);
        r12 = r13.getString(defpackage.n4i0.MenuItem_android_alphabeticShortcut);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0152, code lost:
    
        if (r12 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0154, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x015a, code lost:
    
        r2.n = r12;
        r2.o = r13.getInt(defpackage.n4i0.MenuItem_alphabeticModifiers, 4096);
        r12 = r13.getString(defpackage.n4i0.MenuItem_android_numericShortcut);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016c, code lost:
    
        if (r12 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016e, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0174, code lost:
    
        r2.p = r12;
        r2.q = r13.getInt(defpackage.n4i0.MenuItem_numericModifiers, 4096);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0184, code lost:
    
        if (r13.hasValue(defpackage.n4i0.MenuItem_android_checkable) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        r2.r = r13.getBoolean(defpackage.n4i0.MenuItem_android_checkable, false) ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
    
        r2.s = r13.getBoolean(defpackage.n4i0.MenuItem_android_checked, false);
        r2.t = r13.getBoolean(defpackage.n4i0.MenuItem_android_visible, r2.f);
        r2.u = r13.getBoolean(defpackage.n4i0.MenuItem_android_enabled, r2.g);
        r2.v = r13.getInt(defpackage.n4i0.MenuItem_showAsAction, -1);
        r2.y = r13.getString(defpackage.n4i0.MenuItem_android_onClick);
        r2.w = r13.getResourceId(defpackage.n4i0.MenuItem_actionLayout, 0);
        r2.x = r13.getString(defpackage.n4i0.MenuItem_actionViewClass);
        r12 = r13.getString(defpackage.n4i0.MenuItem_actionProviderClass);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d6, code lost:
    
        if (r12 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01da, code lost:
    
        if (r2.w != 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01de, code lost:
    
        if (r2.x != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01e0, code lost:
    
        r2.z = (defpackage.gx) r2.a(r12, androidx.appcompat.view.SupportMenuInflater.ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE, r16.mActionProviderConstructorArguments);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ef, code lost:
    
        r2.A = r13.getText(defpackage.n4i0.MenuItem_contentDescription);
        r2.B = r13.getText(defpackage.n4i0.MenuItem_tooltipText);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0205, code lost:
    
        if (r13.hasValue(defpackage.n4i0.MenuItem_iconTintMode) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0207, code lost:
    
        r2.D = defpackage.vbm.c(r13.getInt(defpackage.n4i0.MenuItem_iconTintMode, -1), r2.D);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x021e, code lost:
    
        if (r13.hasValue(defpackage.n4i0.MenuItem_iconTint) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0220, code lost:
    
        r2.C = r3.a(defpackage.n4i0.MenuItem_iconTint);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x022b, code lost:
    
        r3.g();
        r2.h = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0229, code lost:
    
        r2.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0216, code lost:
    
        r2.D = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ed, code lost:
    
        r2.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        r2.r = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0170, code lost:
    
        r12 = r12.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0156, code lost:
    
        r12 = r12.charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0236, code lost:
    
        if (r3.equals(androidx.appcompat.view.SupportMenuInflater.XML_MENU) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0238, code lost:
    
        r2.h = true;
        r3 = r14.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r3.getItem());
        r4 = r17;
        parseMenu(r4, r18, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0253, code lost:
    
        r4 = r17;
        r11 = r3;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x025e, code lost:
    
        defpackage.kbs.g("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0263, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        r9 = false;
        r10 = false;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r9 != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseMenu(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals(XML_MENU)) {
                    kbs.g("Expecting menu, got ".concat(name));
                    return;
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
    }

    public Object getRealOwner() {
        if (this.mRealOwner == null) {
            this.mRealOwner = findRealOwner(this.mContext);
        }
        return this.mRealOwner;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.mContext.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (menuBuilder.isDispatchingItemsChanged()) {
                        menuBuilder.stopDispatchingItemsChanged();
                        z = true;
                    }
                }
                parseMenu(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((MenuBuilder) menu).startDispatchingItemsChanged();
                }
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuBuilder) menu).startDispatchingItemsChanged();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
