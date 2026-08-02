package defpackage;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes4.dex */
public class iay implements tsr {
    public SharedPreferences a;
    public final hay b = new hay(0);

    public static void c(tt5 tt5Var, final iay iayVar) {
        tt5Var.getClass();
        o501 d = tt5Var.d(new st5());
        String concat = "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.remove".concat("");
        px10 px10Var = px10.d;
        m2v m2vVar = new m2v(tt5Var, concat, px10Var, d);
        if (iayVar != null) {
            final int i = 0;
            m2vVar.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i2 = i;
                    iay iayVar2 = this.b;
                    switch (i2) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar.G(null);
        }
        m2v m2vVar2 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setBool".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i2 = 1;
            m2vVar2.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i2;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar2.G(null);
        }
        m2v m2vVar3 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setString".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i3 = 2;
            m2vVar3.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i3;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar3.G(null);
        }
        m2v m2vVar4 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setInt".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i4 = 3;
            m2vVar4.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i4;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar4.G(null);
        }
        m2v m2vVar5 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDouble".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i5 = 4;
            m2vVar5.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i5;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar5.G(null);
        }
        m2v m2vVar6 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setEncodedStringList".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i6 = 5;
            m2vVar6.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i6;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar6.G(null);
        }
        m2v m2vVar7 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.setDeprecatedStringList".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i7 = 6;
            m2vVar7.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i7;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar7.G(null);
        }
        m2v m2vVar8 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.clear".concat(""), px10Var, d);
        if (iayVar != null) {
            final int i8 = 7;
            m2vVar8.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i8;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        } else {
            m2vVar8.G(null);
        }
        m2v m2vVar9 = new m2v(tt5Var, "dev.flutter.pigeon.shared_preferences_android.SharedPreferencesApi.getAll".concat(""), px10Var, d);
        if (iayVar == null) {
            m2vVar9.G(null);
        } else {
            final int i9 = 8;
            m2vVar9.G(new ee5(iayVar) { // from class: rx10
                public final /* synthetic */ iay b;

                {
                    this.b = iayVar;
                }

                @Override // defpackage.ee5
                public final void m(Object obj, ce5 ce5Var) {
                    Boolean bool;
                    int i22 = i9;
                    iay iayVar2 = this.b;
                    switch (i22) {
                        case 0:
                            ArrayList arrayList = new ArrayList();
                            try {
                                arrayList.add(0, Boolean.valueOf(iayVar2.a.edit().remove((String) ((ArrayList) obj).get(0)).commit()));
                            } catch (Throwable th) {
                                arrayList = wx10.a(th);
                            }
                            ce5Var.a(arrayList);
                            break;
                        case 1:
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = (ArrayList) obj;
                            try {
                                arrayList2.add(0, Boolean.valueOf(iayVar2.a.edit().putBoolean((String) arrayList3.get(0), ((Boolean) arrayList3.get(1)).booleanValue()).commit()));
                            } catch (Throwable th2) {
                                arrayList2 = wx10.a(th2);
                            }
                            ce5Var.a(arrayList2);
                            break;
                        case 2:
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = (ArrayList) obj;
                            String str = (String) arrayList5.get(0);
                            String str2 = (String) arrayList5.get(1);
                            try {
                                iayVar2.getClass();
                                if (str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") || str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                                    kbs.g("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
                                    bool = null;
                                } else {
                                    bool = Boolean.valueOf(iayVar2.a.edit().putString(str, str2).commit());
                                }
                                arrayList4.add(0, bool);
                            } catch (Throwable th3) {
                                arrayList4 = wx10.a(th3);
                            }
                            ce5Var.a(arrayList4);
                            break;
                        case 3:
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = (ArrayList) obj;
                            try {
                                arrayList6.add(0, Boolean.valueOf(iayVar2.a.edit().putLong((String) arrayList7.get(0), ((Long) arrayList7.get(1)).longValue()).commit()));
                            } catch (Throwable th4) {
                                arrayList6 = wx10.a(th4);
                            }
                            ce5Var.a(arrayList6);
                            break;
                        case 4:
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = (ArrayList) obj;
                            String str3 = (String) arrayList9.get(0);
                            Double d2 = (Double) arrayList9.get(1);
                            try {
                                iayVar2.getClass();
                                String d3 = Double.toString(d2.doubleValue());
                                arrayList8.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str3, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu" + d3).commit()));
                            } catch (Throwable th5) {
                                arrayList8 = wx10.a(th5);
                            }
                            ce5Var.a(arrayList8);
                            break;
                        case 5:
                            ArrayList arrayList10 = new ArrayList();
                            ArrayList arrayList11 = (ArrayList) obj;
                            try {
                                arrayList10.add(0, Boolean.valueOf(iayVar2.a.edit().putString((String) arrayList11.get(0), (String) arrayList11.get(1)).commit()));
                            } catch (Throwable th6) {
                                arrayList10 = wx10.a(th6);
                            }
                            ce5Var.a(arrayList10);
                            break;
                        case 6:
                            ArrayList arrayList12 = new ArrayList();
                            ArrayList arrayList13 = (ArrayList) obj;
                            String str4 = (String) arrayList13.get(0);
                            List list = (List) arrayList13.get(1);
                            try {
                                arrayList12.add(0, Boolean.valueOf(iayVar2.a.edit().putString(str4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + iayVar2.b.h(list)).commit()));
                            } catch (Throwable th7) {
                                arrayList12 = wx10.a(th7);
                            }
                            ce5Var.a(arrayList12);
                            break;
                        case 7:
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = (ArrayList) obj;
                            try {
                                arrayList14.add(0, iayVar2.a((String) arrayList15.get(0), (List) arrayList15.get(1)));
                            } catch (Throwable th8) {
                                arrayList14 = wx10.a(th8);
                            }
                            ce5Var.a(arrayList14);
                            break;
                        default:
                            ArrayList arrayList16 = new ArrayList();
                            ArrayList arrayList17 = (ArrayList) obj;
                            try {
                                arrayList16.add(0, iayVar2.b((String) arrayList17.get(0), (List) arrayList17.get(1)));
                            } catch (Throwable th9) {
                                arrayList16 = wx10.a(th9);
                            }
                            ce5Var.a(arrayList16);
                            break;
                    }
                }
            });
        }
    }

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.a.edit();
        Map<String, ?> all = this.a.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        Object obj;
        HashSet hashSet = list == null ? null : new HashSet(list);
        Map<String, ?> all = this.a.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            try {
                                obj2 = (List) new ptu0(new ByteArrayInputStream(Base64.decode(str3.substring(40), 0))).readObject();
                            } catch (IOException | ClassNotFoundException e) {
                                ny61.j(e);
                                obj2 = null;
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        this.a.edit().remove(str2).putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.b.h(arrayList)).apply();
                        obj = arrayList;
                    }
                    hashMap.put(str2, obj2);
                }
                obj2 = obj;
                hashMap.put(str2, obj2);
            }
        }
        return hashMap;
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        this.a = ssrVar.a.getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            c(tt5Var, this);
        } catch (Exception e) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e);
        }
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        c(ssrVar.c, null);
    }
}
