package defpackage;

import java.security.cert.PolicyNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class m490 implements PolicyNode {
    public final ArrayList a;
    public final int b;
    public Set c;
    public PolicyNode d;
    public final Set e;
    public final String f;
    public final boolean g;

    public m490(ArrayList arrayList, int i, Set set, PolicyNode policyNode, Set set2, String str, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = set;
        this.d = policyNode;
        this.e = set2;
        this.f = str;
        this.g = z;
    }

    public final m490 a() {
        HashSet hashSet = new HashSet();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            hashSet.add(new String((String) it.next()));
        }
        HashSet hashSet2 = new HashSet();
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            hashSet2.add(new String((String) it2.next()));
        }
        m490 m490Var = new m490(new ArrayList(), this.b, hashSet, null, hashSet2, new String(this.f), this.g);
        Iterator it3 = this.a.iterator();
        while (it3.hasNext()) {
            m490 a = ((m490) it3.next()).a();
            a.d = m490Var;
            m490Var.a.add(a);
            a.d = m490Var;
        }
        return m490Var;
    }

    public final String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(this.f);
        stringBuffer.append(" {\n");
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                stringBuffer.append(str);
                stringBuffer.append("}\n");
                return stringBuffer.toString();
            }
            stringBuffer.append(((m490) arrayList.get(i)).b(str.concat(Extension.TAB_CHAR)));
            i++;
        }
    }

    public final Object clone() {
        return a();
    }

    @Override // java.security.cert.PolicyNode
    public final Iterator getChildren() {
        return this.a.iterator();
    }

    @Override // java.security.cert.PolicyNode
    public final int getDepth() {
        return this.b;
    }

    @Override // java.security.cert.PolicyNode
    public final Set getExpectedPolicies() {
        return this.c;
    }

    @Override // java.security.cert.PolicyNode
    public final PolicyNode getParent() {
        return this.d;
    }

    @Override // java.security.cert.PolicyNode
    public final Set getPolicyQualifiers() {
        return this.e;
    }

    @Override // java.security.cert.PolicyNode
    public final String getValidPolicy() {
        return this.f;
    }

    @Override // java.security.cert.PolicyNode
    public final boolean isCritical() {
        return this.g;
    }

    public final String toString() {
        return b("");
    }
}
