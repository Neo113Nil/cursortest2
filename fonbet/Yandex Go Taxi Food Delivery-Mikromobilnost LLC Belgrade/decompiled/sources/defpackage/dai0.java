package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.RoomDatabase;
import androidx.room.j;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.zzlh;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.multitariff.MinSelectedCount;
import com.yandex.go.multitariff.OrderButton;
import com.yandex.go.multitariff.SelectionRules;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.serialization.modules.a;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.array.DerValue;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.MainScreenVersion;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes.dex */
public abstract class dai0 {
    public static final Class[] a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final Object b = new Object();
    public static final Object c = new Object();

    public static final String A(String str) {
        byte[] bArr;
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes(uza.a));
        } catch (Exception e) {
            xby.d.k(e, "Got crypto exception");
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        return new ByteString(Arrays.copyOf(copyOf, copyOf.length)).i();
    }

    public static final void B(Context context) {
        String[] strArr;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            hgz g = hgz.g();
            String[] strArr2 = b951.a;
            g.getClass();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            strArr = b951.a;
            int d = gw00.d(strArr.length);
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            for (String str : strArr) {
                Pair pair = new Pair(new File(databasePath.getPath() + str), new File(noBackupFilesDir.getPath() + str));
                linkedHashMap.put(pair.c(), pair.f());
            }
            for (Map.Entry entry : b.o(linkedHashMap, new Pair(databasePath, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        hgz g2 = hgz.g();
                        String[] strArr3 = b951.a;
                        file2.toString();
                        g2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    hgz g3 = hgz.g();
                    String[] strArr4 = b951.a;
                    g3.getClass();
                }
            }
        }
    }

    public static byx C() {
        return new byx(Screen.MAIN, new c430(Mode.NORMAL, (kotlinx.serialization.json.b) null, (un0) null));
    }

    public static final boolean D(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static oz50 F(jci0 jci0Var) {
        int parseInt = Integer.parseInt(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        long parseLong = Long.parseLong(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        long parseLong2 = Long.parseLong(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        wu50 wu50Var = new wu50();
        int parseInt2 = Integer.parseInt(jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        for (int i = 0; i < parseInt2; i++) {
            String j1 = jci0Var.j1(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
            int G = evu0.G(j1, ':', 0, 6);
            if (G == -1) {
                w511.f("Unexpected header: ".concat(j1));
                return null;
            }
            wu50Var.a(evu0.k0(j1.substring(0, G)).toString(), j1.substring(G + 1));
        }
        return new oz50(parseInt, parseLong, parseLong2, wu50Var.b(), 48);
    }

    public static final void I(a aVar) {
        aVar.g(qoi0.a(d6x.class), h6x.a);
        aVar.g(qoi0.a(v6x.class), x6x.a);
        aVar.g(qoi0.a(m5x.class), n5x.a);
        aVar.g(qoi0.a(j5x.class), l5x.a);
        aVar.g(qoi0.a(s6x.class), u6x.a);
        aVar.g(qoi0.a(r5x.class), s5x.a);
    }

    public static final Pair[] J(Map map) {
        Iterator it = map.entrySet().iterator();
        int size = map.size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            Map.Entry entry = (Map.Entry) it.next();
            pairArr[i] = new Pair(entry.getKey(), entry.getValue());
        }
        return pairArr;
    }

    public static String K(Bitmap bitmap) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (Throwable th) {
            xby.l(jst.e, "PreviewVariableFactory", null, th, "Base64 convert problems", 2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tls] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [e530] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void L(cqh cqhVar, Object obj, tls tlsVar) {
        t300 t300Var;
        if (!cqhVar.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = cqhVar.getNode().getParent$ui();
        LayoutNode P = qje.P(cqhVar);
        while (P != null) {
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        lqh lqhVar = parent$ui;
                        ?? r4 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof dd11) {
                                dd11 dd11Var = (dd11) lqhVar;
                                if (!(obj.equals(dd11Var.V()) ? ((Boolean) tlsVar.invoke(dd11Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 262144) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var = lqhVar.b;
                                int i = 0;
                                lqhVar = lqhVar;
                                r4 = r4;
                                while (e530Var != null) {
                                    if ((e530Var.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            lqhVar = e530Var;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r4.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r4.b(e530Var);
                                        }
                                    }
                                    e530Var = e530Var.getChild$ui();
                                    lqhVar = lqhVar;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            lqhVar = qje.c(r4);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [tls] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [e530] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void M(dd11 dd11Var, tls tlsVar) {
        t300 t300Var;
        if (!dd11Var.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = dd11Var.getNode().getParent$ui();
        LayoutNode P = qje.P(dd11Var);
        while (P != null) {
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        lqh lqhVar = parent$ui;
                        ?? r5 = 0;
                        while (lqhVar != 0) {
                            boolean z = true;
                            if (lqhVar instanceof dd11) {
                                dd11 dd11Var2 = (dd11) lqhVar;
                                if (jl40.l(dd11Var.V(), dd11Var2.V()) && dd11Var.getClass() == dd11Var2.getClass()) {
                                    z = ((Boolean) tlsVar.invoke(dd11Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 262144) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var = lqhVar.b;
                                int i = 0;
                                lqhVar = lqhVar;
                                r5 = r5;
                                while (e530Var != null) {
                                    if ((e530Var.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        r5 = r5;
                                        if (i == 1) {
                                            lqhVar = e530Var;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r5.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r5.b(e530Var);
                                        }
                                    }
                                    e530Var = e530Var.getChild$ui();
                                    lqhVar = lqhVar;
                                    r5 = r5;
                                }
                                if (i == 1) {
                                }
                            }
                            lqhVar = qje.c(r5);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [tls] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void N(e530 e530Var, String str, tls tlsVar) {
        if (!e530Var.getNode().isAttached()) {
            ixv.b("visitSubtreeIf called on an unattached node");
        }
        wz40 wz40Var = new wz40(new e530[16]);
        e530 child$ui = e530Var.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var, e530Var.getNode());
        } else {
            wz40Var.b(child$ui);
        }
        while (true) {
            int i = wz40Var.c;
            if (i == 0) {
                return;
            }
            e530 e530Var2 = (e530) wz40Var.k(i - 1);
            if ((e530Var2.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (e530 e530Var3 = e530Var2; e530Var3 != null && e530Var3.isAttached(); e530Var3 = e530Var3.getChild$ui()) {
                    if ((e530Var3.getKindSet$ui() & 262144) != 0) {
                        lqh lqhVar = e530Var3;
                        ?? r6 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof dd11) {
                                dd11 dd11Var = (dd11) lqhVar;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = str.equals(dd11Var.V()) ? (TraversableNode$Companion$TraverseDescendantsAction) tlsVar.invoke(dd11Var) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 262144) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var4 = lqhVar.b;
                                int i2 = 0;
                                lqhVar = lqhVar;
                                r6 = r6;
                                while (e530Var4 != null) {
                                    if ((e530Var4.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            lqhVar = e530Var4;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r6.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r6.b(e530Var4);
                                        }
                                    }
                                    e530Var4 = e530Var4.getChild$ui();
                                    lqhVar = lqhVar;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            lqhVar = qje.c(r6);
                        }
                    }
                }
            }
            qje.b(wz40Var, e530Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [tls] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [e530] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void O(dd11 dd11Var, tls tlsVar) {
        if (!dd11Var.getNode().isAttached()) {
            ixv.b("visitSubtreeIf called on an unattached node");
        }
        wz40 wz40Var = new wz40(new e530[16]);
        e530 child$ui = dd11Var.getNode().getChild$ui();
        if (child$ui == null) {
            qje.b(wz40Var, dd11Var.getNode());
        } else {
            wz40Var.b(child$ui);
        }
        while (true) {
            int i = wz40Var.c;
            if (i == 0) {
                return;
            }
            e530 e530Var = (e530) wz40Var.k(i - 1);
            if ((e530Var.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (e530 e530Var2 = e530Var; e530Var2 != null && e530Var2.isAttached(); e530Var2 = e530Var2.getChild$ui()) {
                    if ((e530Var2.getKindSet$ui() & 262144) != 0) {
                        lqh lqhVar = e530Var2;
                        ?? r7 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof dd11) {
                                dd11 dd11Var2 = (dd11) lqhVar;
                                TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = (jl40.l(dd11Var.V(), dd11Var2.V()) && dd11Var.getClass() == dd11Var2.getClass()) ? (TraversableNode$Companion$TraverseDescendantsAction) tlsVar.invoke(dd11Var2) : TraversableNode$Companion$TraverseDescendantsAction.ContinueTraversal;
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traversableNode$Companion$TraverseDescendantsAction == TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 262144) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var3 = lqhVar.b;
                                int i2 = 0;
                                lqhVar = lqhVar;
                                r7 = r7;
                                while (e530Var3 != null) {
                                    if ((e530Var3.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            lqhVar = e530Var3;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r7.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r7.b(e530Var3);
                                        }
                                    }
                                    e530Var3 = e530Var3.getChild$ui();
                                    lqhVar = lqhVar;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            lqhVar = qje.c(r7);
                        }
                    }
                }
            }
            qje.b(wz40Var, e530Var);
        }
    }

    public static void R(oz50 oz50Var, ici0 ici0Var) {
        ici0Var.d0(oz50Var.a);
        ici0Var.writeByte(10);
        ici0Var.d0(oz50Var.b);
        ici0Var.writeByte(10);
        ici0Var.d0(oz50Var.c);
        ici0Var.writeByte(10);
        Set<Map.Entry> entrySet = oz50Var.d.a.entrySet();
        Iterator it = entrySet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        ici0Var.d0(i);
        ici0Var.writeByte(10);
        for (Map.Entry entry : entrySet) {
            for (String str : (List) entry.getValue()) {
                ici0Var.p1((String) entry.getKey());
                ici0Var.p1(":");
                ici0Var.p1(str);
                ici0Var.writeByte(10);
            }
        }
    }

    public static int S(byte[] bArr, int i, v43 v43Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return T(b2, bArr, i2, v43Var);
        }
        v43Var.a = b2;
        return i2;
    }

    public static int T(int i, byte[] bArr, int i2, v43 v43Var) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & HProv.PP_VERSION_TIMESTAMP;
        if (b2 >= 0) {
            v43Var.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            v43Var.a = i5 | (b3 << PKIBody._CCR);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            v43Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            v43Var.a = i9 | (b5 << DerValue.tag_UniversalString);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                v43Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int U(byte[] bArr, int i, v43 v43Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            v43Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        v43Var.b = j2;
        return i3;
    }

    public static int V(int i, byte[] bArr) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public static long W(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static int X(byte[] bArr, int i, v43 v43Var) {
        int i2;
        int S = S(bArr, i, v43Var);
        int i3 = v43Var.a;
        if (i3 < 0) {
            ny61.B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 == 0) {
            v43Var.c = "";
            return S;
        }
        int i4 = f1.a;
        int length = bArr.length;
        if ((((length - S) - i3) | S | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(S), Integer.valueOf(i3)));
        }
        int i5 = S + i3;
        char[] cArr = new char[i3];
        int i6 = 0;
        while (S < i5) {
            byte b2 = bArr[S];
            if (!gya1.g(b2)) {
                break;
            }
            S++;
            cArr[i6] = (char) b2;
            i6++;
        }
        int i7 = i6;
        while (S < i5) {
            int i8 = S + 1;
            byte b3 = bArr[S];
            if (gya1.g(b3)) {
                cArr[i7] = (char) b3;
                i7++;
                S = i8;
                while (S < i5) {
                    byte b4 = bArr[S];
                    if (gya1.g(b4)) {
                        S++;
                        cArr[i7] = (char) b4;
                        i7++;
                    }
                }
            } else {
                if (b3 < -32) {
                    if (i8 >= i5) {
                        ny61.B("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    i2 = i7 + 1;
                    S += 2;
                    gya1.h(b3, bArr[i8], cArr, i7);
                } else if (b3 < -16) {
                    if (i8 >= i5 - 1) {
                        ny61.B("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    i2 = i7 + 1;
                    int i9 = S + 2;
                    S += 3;
                    gya1.i(b3, bArr[i8], bArr[i9], cArr, i7);
                } else {
                    if (i8 >= i5 - 2) {
                        ny61.B("Protocol message had invalid UTF-8.");
                        return 0;
                    }
                    byte b5 = bArr[i8];
                    int i10 = S + 3;
                    byte b6 = bArr[S + 2];
                    S += 4;
                    gya1.j(b3, b5, b6, bArr[i10], cArr, i7);
                    i7 += 2;
                }
                i7 = i2;
            }
        }
        v43Var.c = new String(cArr, 0, i7);
        return i5;
    }

    public static int Y(byte[] bArr, int i, v43 v43Var) {
        int S = S(bArr, i, v43Var);
        int i2 = v43Var.a;
        if (i2 < 0) {
            ny61.B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - S) {
            ny61.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            v43Var.c = zzlh.a;
            return S;
        }
        v43Var.c = zzlh.g(S, i2, bArr);
        return S + i2;
    }

    public static int Z(Object obj, n7b1 n7b1Var, byte[] bArr, int i, int i2, v43 v43Var) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = T(i4, bArr, i3, v43Var);
            i4 = v43Var.a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            ny61.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = v43Var.d + 1;
        v43Var.d = i6;
        if (i6 >= 100) {
            ny61.B("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        n7b1Var.g(obj, bArr, i5, i7, v43Var);
        v43Var.d--;
        v43Var.c = obj;
        return i7;
    }

    public static final boolean a(c cVar) {
        cnq0 k = cVar.k();
        return !k.a.b(d.j);
    }

    public static int a0(Object obj, n7b1 n7b1Var, byte[] bArr, int i, int i2, int i3, v43 v43Var) {
        c1 c1Var = (c1) n7b1Var;
        int i4 = v43Var.d + 1;
        v43Var.d = i4;
        if (i4 >= 100) {
            ny61.B("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int t = c1Var.t(obj, bArr, i, i2, i3, v43Var);
        v43Var.d--;
        v43Var.c = obj;
        return t;
    }

    public static final boolean b(c cVar) {
        return cVar.c.S == LayoutDirection.Rtl;
    }

    public static int b0(int i, byte[] bArr, int i2, int i3, z0b1 z0b1Var, v43 v43Var) {
        jza1 jza1Var = (jza1) z0b1Var;
        int S = S(bArr, i2, v43Var);
        jza1Var.e(v43Var.a);
        while (S < i3) {
            int S2 = S(bArr, S, v43Var);
            if (i != v43Var.a) {
                break;
            }
            S = S(bArr, S2, v43Var);
            jza1Var.e(v43Var.a);
        }
        return S;
    }

    public static final boolean c(c cVar, Resources resources) {
        List list = (List) androidx.compose.ui.semantics.b.a(cVar.d, d.a);
        return !cvw.P(cVar) && (cVar.d.c || (cVar.q() && ((list != null ? (String) kotlin.collections.a.R(list) : null) != null || t(cVar) != null || s(cVar, resources) != null || r(cVar))));
    }

    public static int c0(byte[] bArr, int i, z0b1 z0b1Var, v43 v43Var) {
        jza1 jza1Var = (jza1) z0b1Var;
        int S = S(bArr, i, v43Var);
        int i2 = v43Var.a + S;
        while (S < i2) {
            S = S(bArr, S, v43Var);
            jza1Var.e(v43Var.a);
        }
        if (S == i2) {
            return S;
        }
        ny61.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static final boolean d(Object obj) {
        if (obj instanceof b3t0) {
            b3t0 b3t0Var = (b3t0) obj;
            if (b3t0Var.getPolicy() == x4c.Q || b3t0Var.getPolicy() == ngd0.F || b3t0Var.getPolicy() == xw91.D) {
                Object value = b3t0Var.getValue();
                if (value == null) {
                    return true;
                }
                return d(value);
            }
        } else if (!(obj instanceof cms) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int d0(n7b1 n7b1Var, int i, byte[] bArr, int i2, int i3, z0b1 z0b1Var, v43 v43Var) {
        Object zza = n7b1Var.zza();
        n7b1 n7b1Var2 = n7b1Var;
        byte[] bArr2 = bArr;
        int i4 = i3;
        v43 v43Var2 = v43Var;
        int Z = Z(zza, n7b1Var2, bArr2, i2, i4, v43Var2);
        n7b1Var2.f(zza);
        v43Var2.c = zza;
        z0b1Var.add(zza);
        while (Z < i4) {
            v43 v43Var3 = v43Var2;
            int i5 = i4;
            int S = S(bArr2, Z, v43Var3);
            if (i != v43Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            n7b1 n7b1Var3 = n7b1Var2;
            Object zza2 = n7b1Var3.zza();
            Z = Z(zza2, n7b1Var3, bArr3, S, i5, v43Var3);
            n7b1Var2 = n7b1Var3;
            bArr2 = bArr3;
            i4 = i5;
            v43Var2 = v43Var3;
            n7b1Var2.f(zza2);
            v43Var2.c = zza2;
            z0b1Var.add(zza2);
        }
        return Z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, wf90] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, wf90] */
    public static final wf90 e(List list) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        EmptyList emptyList = EmptyList.a;
        ref$ObjectRef.element = new wf90(emptyList, emptyList);
        ArrayList arrayList = new ArrayList();
        Iterator it = new u1l(2, list).iterator();
        while (true) {
            ListIterator listIterator = ((t2k0) it).a;
            if (!listIterator.hasPrevious()) {
                f(arrayList, ref$ObjectRef);
                return (wf90) ref$ObjectRef.element;
            }
            wf90 wf90Var = (wf90) listIterator.previous();
            if (wf90Var.b.isEmpty()) {
                arrayList.add(wf90Var.a);
            } else {
                f(arrayList, ref$ObjectRef);
                ref$ObjectRef.element = h(wf90Var, (wf90) ref$ObjectRef.element);
            }
        }
    }

    public static int e0(int i, byte[] bArr, int i2, int i3, i9b1 i9b1Var, v43 v43Var) {
        if ((i >>> 3) == 0) {
            ny61.B("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int U = U(bArr, i2, v43Var);
            i9b1Var.d(i, Long.valueOf(v43Var.b));
            return U;
        }
        if (i4 == 1) {
            i9b1Var.d(i, Long.valueOf(W(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int S = S(bArr, i2, v43Var);
            int i5 = v43Var.a;
            if (i5 < 0) {
                ny61.B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - S) {
                ny61.B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                i9b1Var.d(i, zzlh.a);
            } else {
                i9b1Var.d(i, zzlh.g(S, i5, bArr));
            }
            return S + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                i9b1Var.d(i, Integer.valueOf(V(i2, bArr)));
                return i2 + 4;
            }
            ny61.B("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i & (-8)) | 4;
        i9b1 a2 = i9b1.a();
        int i7 = v43Var.d + 1;
        v43Var.d = i7;
        if (i7 >= 100) {
            ny61.B("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int S2 = S(bArr, i2, v43Var);
            int i9 = v43Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = S2;
                break;
            }
            i2 = e0(i9, bArr, S2, i3, a2, v43Var);
            i8 = i9;
        }
        v43Var.d--;
        if (i2 > i3 || i8 != i6) {
            ny61.B("Failed to parse the message.");
            return 0;
        }
        i9b1Var.d(i, a2);
        return i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, wf90] */
    public static final void f(ArrayList arrayList, Ref$ObjectRef ref$ObjectRef) {
        if (arrayList.isEmpty()) {
            return;
        }
        ListBuilder a2 = rcc.a();
        Iterator it = new s2k0(arrayList).iterator();
        while (true) {
            ListIterator listIterator = ((r2k0) it).a;
            if (!listIterator.hasPrevious()) {
                ref$ObjectRef.element = h(new wf90(a2.j(), EmptyList.a), (wf90) ref$ObjectRef.element);
                arrayList.clear();
                return;
            }
            a2.addAll((List) listIterator.previous());
        }
    }

    public static int f0(int i, byte[] bArr, int i2, int i3, v43 v43Var) {
        if ((i >>> 3) == 0) {
            ny61.B("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return U(bArr, i2, v43Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return S(bArr, i2, v43Var) + v43Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            ny61.B("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = S(bArr, i2, v43Var);
            i6 = v43Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = f0(i6, bArr, i2, i3, v43Var);
        }
        if (i2 <= i3 && i6 == i5) {
            return i2;
        }
        ny61.B("Failed to parse the message.");
        return 0;
    }

    public static final wf90 g(List list, ArrayList arrayList, ArrayList arrayList2, wf90 wf90Var) {
        List list2 = wf90Var.a;
        uf90 uf90Var = (uf90) kotlin.collections.a.R(list2);
        ListBuilder a2 = rcc.a();
        a2.addAll(list);
        if (arrayList == null) {
            a2.addAll(list2);
        } else if (uf90Var instanceof gn60) {
            a2.add(new gn60(kotlin.collections.a.m0(((gn60) uf90Var).a, arrayList)));
            int f = scc.f(list2);
            int i = 1;
            if (1 <= f) {
                while (true) {
                    a2.add(list2.get(i));
                    if (i == f) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            a2.add(new gn60(arrayList));
            a2.addAll(list2);
        }
        a2.addAll(arrayList2);
        return new wf90(a2.j(), wf90Var.b);
    }

    public static final wf90 h(wf90 wf90Var, wf90 wf90Var2) {
        List singletonList;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        for (uf90 uf90Var : wf90Var.a) {
            if (uf90Var instanceof gn60) {
                if (arrayList3 != null) {
                    arrayList3.addAll(((gn60) uf90Var).a);
                } else {
                    arrayList3 = new ArrayList(((gn60) uf90Var).a);
                }
            } else if (uf90Var instanceof ox11) {
                arrayList2.add(uf90Var);
            } else {
                if (arrayList3 != null) {
                    arrayList.add(new gn60(arrayList3));
                    arrayList.addAll(arrayList2);
                    arrayList2.clear();
                    arrayList3 = null;
                }
                arrayList.add(uf90Var);
            }
        }
        List list = wf90Var.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wf90 h = h((wf90) it.next(), wf90Var2);
            if (h.a.isEmpty()) {
                List list2 = h.b;
                if (list2.isEmpty()) {
                    list2 = Collections.singletonList(h);
                }
                singletonList = list2;
            } else {
                singletonList = Collections.singletonList(h);
            }
            ycc.r(singletonList, arrayList4);
        }
        boolean isEmpty = arrayList4.isEmpty();
        Collection collection = arrayList4;
        if (isEmpty) {
            if (!wf90Var2.a.isEmpty()) {
                return g(arrayList, arrayList3, arrayList2, wf90Var2);
            }
            collection = wf90Var2.b;
        }
        ArrayList arrayList5 = (List) collection;
        if (arrayList3 != null || arrayList.isEmpty()) {
            ArrayList arrayList6 = arrayList5;
            if (!(arrayList6 instanceof Collection) || !arrayList6.isEmpty()) {
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    if (kotlin.collections.a.R(((wf90) it2.next()).a) instanceof gn60) {
                        ArrayList arrayList7 = new ArrayList(tcc.n(arrayList6, 10));
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            arrayList7.add(g(EmptyList.a, arrayList3, arrayList2, (wf90) it3.next()));
                        }
                        return new wf90(arrayList, arrayList7);
                    }
                }
            }
        }
        if (arrayList3 != null) {
            arrayList.add(new gn60(arrayList3));
        }
        arrayList.addAll(arrayList2);
        return new wf90(arrayList, arrayList5);
    }

    public static boolean i(tw01 tw01Var, Object obj) {
        if (obj == null) {
            while (tw01Var.hasNext()) {
                if (tw01Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (tw01Var.hasNext()) {
            if (obj.equals(tw01Var.next())) {
                return true;
            }
        }
        return false;
    }

    public static final j10 j(RoomDatabase roomDatabase, String[] strArr, tls tlsVar) {
        androidx.room.d dVar = roomDatabase.f;
        if (dVar == null) {
            dVar = null;
        }
        return new j10(e.o(dVar.a((String[]) Arrays.copyOf(strArr, strArr.length))), roomDatabase, tlsVar, 3);
    }

    public static final OrderButton k(OrderButton orderButton, SelectionRules selectionRules, Set set) {
        MinSelectedCount minSelectedCount = selectionRules.a;
        return minSelectedCount == MinSelectedCount.c ? orderButton : minSelectedCount.a <= set.size() ? new OrderButton(true, "") : new OrderButton(false, minSelectedCount.b);
    }

    public static final j l(Context context, Class cls, String str) {
        if (str == null || evu0.J(str)) {
            ny61.g("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!jl40.l(str, ":memory:")) {
            return new j(context, cls, str);
        }
        ny61.g("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final LayoutNode m(LayoutNode layoutNode, tls tlsVar) {
        for (LayoutNode s = layoutNode.s(); s != null; s = s.s()) {
            if (((Boolean) tlsVar.invoke(s)).booleanValue()) {
                return s;
            }
        }
        return null;
    }

    public static final dd11 n(lqh lqhVar, Object obj) {
        t300 t300Var;
        if (!lqhVar.getNode().isAttached()) {
            ixv.b("visitAncestors called on an unattached node");
        }
        e530 parent$ui = lqhVar.getNode().getParent$ui();
        LayoutNode P = qje.P(lqhVar);
        while (P != null) {
            if ((((e530) P.a0.g).getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        e530 e530Var = parent$ui;
                        wz40 wz40Var = null;
                        while (e530Var != null) {
                            if (e530Var instanceof dd11) {
                                dd11 dd11Var = (dd11) e530Var;
                                if (obj.equals(dd11Var.V())) {
                                    return dd11Var;
                                }
                            }
                            if ((e530Var.getKindSet$ui() & 262144) != 0 && (e530Var instanceof lqh)) {
                                int i = 0;
                                for (e530 e530Var2 = ((lqh) e530Var).b; e530Var2 != null; e530Var2 = e530Var2.getChild$ui()) {
                                    if ((e530Var2.getKindSet$ui() & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            e530Var = e530Var2;
                                        } else {
                                            if (wz40Var == null) {
                                                wz40Var = new wz40(new e530[16]);
                                            }
                                            if (e530Var != null) {
                                                wz40Var.b(e530Var);
                                                e530Var = null;
                                            }
                                            wz40Var.b(e530Var2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            e530Var = qje.c(wz40Var);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            P = P.s();
            parent$ui = (P == null || (t300Var = P.a0) == null) ? null : (v7x0) t300Var.f;
        }
        return null;
    }

    public static final String p(tn3 tn3Var) {
        if (tn3Var instanceof sn3) {
            return "unauthorized";
        }
        if (tn3Var instanceof rn3) {
            return oyr.p("authorized(", ((rn3) tn3Var).a(), Extension.C_BRAKE);
        }
        w511.b();
        return null;
    }

    public static final boolean r(c cVar) {
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.b.a(cVar.d, d.K);
        cnq0 cnq0Var = cVar.d;
        awk0 awk0Var = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var, d.z);
        boolean z = toggleableState != null;
        if (((Boolean) androidx.compose.ui.semantics.b.a(cnq0Var, d.J)) == null || (awk0Var != null && awk0Var.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String s(c cVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object a2 = androidx.compose.ui.semantics.b.a(cVar.d, d.b);
        cnq0 cnq0Var = cVar.d;
        ToggleableState toggleableState = (ToggleableState) androidx.compose.ui.semantics.b.a(cnq0Var, d.K);
        awk0 awk0Var = (awk0) androidx.compose.ui.semantics.b.a(cnq0Var, d.z);
        Object obj = null;
        if (toggleableState != null) {
            int i = o82.a[toggleableState.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    if (a2 == null) {
                        a2 = resources.getString(hzh0.indeterminate);
                    }
                } else if (awk0Var != null && awk0Var.a == 2 && a2 == null) {
                    a2 = resources.getString(hzh0.state_off);
                }
            } else if (awk0Var != null && awk0Var.a == 2 && a2 == null) {
                a2 = resources.getString(hzh0.state_on);
            }
        }
        Boolean bool = (Boolean) androidx.compose.ui.semantics.b.a(cnq0Var, d.J);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((awk0Var == null || awk0Var.a != 4) && a2 == null) {
                a2 = booleanValue ? resources.getString(hzh0.selected) : resources.getString(hzh0.not_selected);
            }
        }
        cif0 cif0Var = (cif0) androidx.compose.ui.semantics.b.a(cnq0Var, d.c);
        if (cif0Var != null) {
            cif0 cif0Var2 = cif0.c;
            if (cif0Var != a8a1.k()) {
                if (a2 == null) {
                    s5c b2 = cif0Var.b();
                    float floatValue = Float.valueOf(((r5c) b2).b).floatValue();
                    r5c r5cVar = (r5c) b2;
                    float f = r5cVar.a;
                    float a3 = floatValue - Float.valueOf(f).floatValue() == 0.0f ? 0.0f : (cif0Var.a() - Float.valueOf(f).floatValue()) / (Float.valueOf(r5cVar.b).floatValue() - Float.valueOf(f).floatValue());
                    if (a3 < 0.0f) {
                        a3 = 0.0f;
                    }
                    if (a3 > 1.0f) {
                        a3 = 1.0f;
                    }
                    a2 = resources.getString(hzh0.template_percent, Integer.valueOf(a3 == 0.0f ? 0 : a3 == 1.0f ? 100 : y6i0.d(Math.round(a3 * 100.0f), 1, 99)));
                }
            } else if (a2 == null) {
                a2 = resources.getString(hzh0.in_progress);
            }
        }
        g gVar = d.G;
        if (cnq0Var.a.b(gVar)) {
            cnq0 k = new c(cVar.a, true, cVar.c, cnq0Var).k();
            Collection collection2 = (Collection) androidx.compose.ui.semantics.b.a(k, d.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) androidx.compose.ui.semantics.b.a(k, d.C)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) androidx.compose.ui.semantics.b.a(k, gVar)) == null || charSequence.length() == 0))) {
                obj = resources.getString(hzh0.state_empty);
            }
            a2 = obj;
        }
        return (String) a2;
    }

    public static final kk2 t(c cVar) {
        kk2 kk2Var = (kk2) androidx.compose.ui.semantics.b.a(cVar.d, d.G);
        List list = (List) androidx.compose.ui.semantics.b.a(cVar.d, d.C);
        return kk2Var == null ? list != null ? (kk2) kotlin.collections.a.R(list) : null : kk2Var;
    }

    public static boolean u(String str, jbk jbkVar, fpl fplVar, rvo rvoVar, tnk tnkVar) {
        if (jbkVar == null || !(fplVar instanceof Div2View)) {
            return false;
        }
        if (!(jbkVar instanceof vak)) {
            Div2View div2View = (Div2View) fplVar;
            return div2View.getDiv2Component().n().a(str, jbkVar, div2View, rvoVar);
        }
        Div2View div2View2 = (Div2View) fplVar;
        ((Uri) ((vak) jbkVar).d().c.a(rvoVar)).toString();
        div2View2.addLoadReference(div2View2.getDiv2Component().i().a(), div2View2);
        return true;
    }

    public static final int v(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean w(String str) {
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v03 y(List list, List list2, lk6 lk6Var, String str, mk6 mk6Var, fw2 fw2Var, boolean z, boolean z2, Float f, fe61 fe61Var, ic00 ic00Var, List list3, List list4, Map map, String str2, List list5) {
        v03 v03Var;
        zzs zzsVar;
        hp40 hp40Var;
        MainScreenVersion mainScreenVersion;
        fv2 fv2Var;
        MainScreenVersion mainScreenVersion2;
        zzs zzsVar2;
        String str3;
        uc4 uc4Var = lk6Var.a;
        xne xneVar = lk6Var.c;
        List list6 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list6, 10));
        Iterator it = list6.iterator();
        while (it.hasNext()) {
            arrayList.add(rzo.N((yne) it.next()));
        }
        List<chf> list7 = list2;
        ArrayList arrayList2 = new ArrayList(tcc.n(list7, 10));
        for (chf chfVar : list7) {
            arrayList2.add(new a13(chfVar.a, chfVar.d, (String) null, chfVar.b, chfVar.c, chfVar.e, chfVar.f, chfVar.g, 4));
            uc4Var = uc4Var;
        }
        uc4 uc4Var2 = uc4Var;
        mk6 mk6Var2 = mk6.e;
        Boolean valueOf = jl40.l(mk6Var, mk6Var2) ? null : Boolean.valueOf(mk6Var.c);
        rrx rrxVar = new rrx(lk6Var.b);
        zzs zzsVar3 = xneVar != null ? xneVar.b : null;
        Integer num = xneVar != null ? xneVar.c : null;
        String str4 = xneVar != null ? xneVar.e : null;
        LocationProvider G = (xneVar == null || (zzsVar2 = xneVar.b) == null || (str3 = zzsVar2.d) == null) ? null : udq0.G(str3);
        Double d = xneVar != null ? xneVar.f : null;
        Integer num2 = xneVar != null ? xneVar.h : null;
        if (jl40.l(mk6Var, mk6Var2)) {
            zzsVar = zzsVar3;
            v03Var = null;
            hp40Var = null;
        } else {
            Boolean valueOf2 = Boolean.valueOf(mk6Var.b);
            v03Var = null;
            Collection collection = mk6Var.d;
            zzsVar = zzsVar3;
            if (!mk6Var.b) {
                collection = null;
            }
            hp40Var = new hp40(valueOf2, collection);
        }
        String str5 = jl40.l(mk6Var, mk6Var2) ? v03Var : mk6Var.a;
        fv2 fv2Var2 = new fv2(fw2Var.b, fw2Var.a);
        Boolean valueOf3 = Boolean.valueOf(z);
        Boolean valueOf4 = Boolean.valueOf(z2);
        if (ic00Var instanceof gc00) {
            mainScreenVersion2 = MainScreenVersion.SHORTCUTS;
        } else {
            if (!(ic00Var instanceof hc00)) {
                if (ic00Var != null) {
                    w511.b();
                    return v03Var;
                }
                mainScreenVersion = v03Var;
                fv2Var = fv2Var2;
                return new v03(str2, uc4Var2, arrayList, list3, list4, str, arrayList2, valueOf, rrxVar, zzsVar, num, str4, G, d, num2, hp40Var, str5, fv2Var, valueOf3, valueOf4, f, fe61Var, mainScreenVersion, map, list5, SelfTester_JCP.DECRYPT_CBC);
            }
            mainScreenVersion2 = MainScreenVersion.FLEX_MAIN;
        }
        fv2Var = fv2Var2;
        mainScreenVersion = mainScreenVersion2;
        return new v03(str2, uc4Var2, arrayList, list3, list4, str, arrayList2, valueOf, rrxVar, zzsVar, num, str4, G, d, num2, hp40Var, str5, fv2Var, valueOf3, valueOf4, f, fe61Var, mainScreenVersion, map, list5, SelfTester_JCP.DECRYPT_CBC);
    }

    public static final FinalSuggestScreen z(com.yandex.go.navigation.screen.api.Screen screen) {
        switch (uv00.a[screen.ordinal()]) {
            case 1:
                return FinalSuggestScreen.SUPERAPP;
            case 2:
                return FinalSuggestScreen.SUPERAPP;
            case 3:
                return FinalSuggestScreen.MAIN;
            case 4:
                return FinalSuggestScreen.MAIN;
            case 5:
                return FinalSuggestScreen.SUMMARY;
            case 6:
                return FinalSuggestScreen.SUMMARY;
            case 7:
                return FinalSuggestScreen.SUMMARY;
            case 8:
                return FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX;
            case 9:
                return FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX;
            case 10:
                return FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX;
            case 11:
                return FinalSuggestScreen.AFTER_ORDER_CLARIFY_POINT;
            case 12:
                return FinalSuggestScreen.AFTER_ORDER_CLARIFY_POINT;
            case 13:
                return FinalSuggestScreen.AFTER_ORDER_CLARIFY_POINT;
            case 14:
                return FinalSuggestScreen.AFTER_ORDER_CLARIFY_POINT;
            case 15:
                return FinalSuggestScreen.AFTER_ORDER_CLARIFY_POINT;
            case 16:
                return FinalSuggestScreen.UNSUPPORTED;
            case 17:
                return FinalSuggestScreen.FAVORITES;
            case 18:
                return FinalSuggestScreen.ADDRESS_CONFIRMATION;
            case 19:
                return FinalSuggestScreen.AFTER_SUMMARY_CLARIFY_POINT;
            case 20:
                return FinalSuggestScreen.UNSUPPORTED;
            case 21:
                return FinalSuggestScreen.UNSUPPORTED;
            case 22:
                return FinalSuggestScreen.UNSUPPORTED;
            case 23:
                return FinalSuggestScreen.UNSUPPORTED;
            case 24:
                return FinalSuggestScreen.UNSUPPORTED;
            case 25:
                return FinalSuggestScreen.UNSUPPORTED;
            case 26:
                return FinalSuggestScreen.UNSUPPORTED;
            case 27:
                return FinalSuggestScreen.UNSUPPORTED;
            case 28:
                return FinalSuggestScreen.UNSUPPORTED;
            case 29:
                return FinalSuggestScreen.UNSUPPORTED;
            case 30:
                return FinalSuggestScreen.UNSUPPORTED;
            case 31:
                return FinalSuggestScreen.UNSUPPORTED;
            case 32:
                return FinalSuggestScreen.UNSUPPORTED;
            case 33:
                return FinalSuggestScreen.UNSUPPORTED;
            case 34:
                return FinalSuggestScreen.UNSUPPORTED;
            case 35:
                return FinalSuggestScreen.UNSUPPORTED;
            case 36:
                return FinalSuggestScreen.UNSUPPORTED;
            case 37:
                return FinalSuggestScreen.UNSUPPORTED;
            case 38:
                return FinalSuggestScreen.UNSUPPORTED;
            case 39:
                return FinalSuggestScreen.UNSUPPORTED;
            case 40:
                return FinalSuggestScreen.UNSUPPORTED;
            case 41:
                return FinalSuggestScreen.UNSUPPORTED;
            default:
                w511.b();
                return null;
        }
    }

    public abstract dai0 E(g0c g0cVar, Object obj);

    public abstract void G(boolean z);

    public abstract void H(boolean z);

    public abstract void P();

    public abstract TransformationMethod Q(TransformationMethod transformationMethod);

    public abstract Object o(g0c g0cVar);

    public abstract InputFilter[] q(InputFilter[] inputFilterArr);

    public abstract boolean x();
}
