package androidx.media3.exoplayer.smoothstreaming.manifest;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import defpackage.qxt0;
import defpackage.rxt0;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public abstract class a {
    public final String a;
    public final String b;
    public final a c;
    public final LinkedList d = new LinkedList();

    public a(a aVar, String str, String str2) {
        this.c = aVar;
        this.a = str;
        this.b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.b(e, null);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.b(e, null);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new SsManifestParser.MissingFieldException(str);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e) {
            throw ParserException.b(e, null);
        }
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.d;
            if (i >= linkedList.size()) {
                a aVar = this.c;
                if (aVar == null) {
                    return null;
                }
                return aVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.b.equals(name)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = this.a;
                        if (equals) {
                            aVar = new rxt0(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            aVar = new qxt0(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            aVar = new b(this, str);
                        }
                        if (aVar == null) {
                            i = 1;
                        } else {
                            a(aVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    k(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void k(XmlPullParser xmlPullParser) {
    }

    public final void l(Object obj, String str) {
        this.d.add(Pair.create(str, obj));
    }
}
