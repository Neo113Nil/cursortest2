package sg.bigo.ads.dg;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.CDATASection;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class a {
    public static String a(Node node) {
        String nodeValue;
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            int min = Math.min(childNodes.getLength(), 5);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    Node item = childNodes.item(i);
                    if ((item instanceof CDATASection) && item.getNodeValue() != null) {
                        nodeValue = item.getNodeValue();
                        break;
                    }
                }
            }
        }
        if (node == null || node.getFirstChild() == null || node.getFirstChild().getNodeValue() == null) {
            return null;
        }
        nodeValue = node.getFirstChild().getNodeValue();
        return nodeValue.trim();
    }

    public static String b(Node node) {
        if (node != null && node.hasChildNodes()) {
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node item = childNodes.item(i);
                if (item != null && !r.b(item.getNodeValue())) {
                    return item.getNodeValue();
                }
            }
        }
        return null;
    }

    public static List<Node> c(Node node, String str) {
        return b(node, str, null, null);
    }

    public static Integer d(Node node, String str) {
        if (node == null) {
            return -1;
        }
        String e = e(node, str);
        if (r.a((CharSequence) e)) {
            return -1;
        }
        try {
            return Integer.valueOf(Integer.parseInt(e));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static String e(Node node, String str) {
        Node namedItem;
        if (node == null || str == null || (namedItem = node.getAttributes().getNamedItem(str)) == null) {
            return null;
        }
        return namedItem.getNodeValue();
    }

    public static Node a(Node node, String str) {
        return a(node, str, null, null);
    }

    @Nullable
    public static String b(Node node, String str) {
        Node a = a(node, str, null, null);
        if (a == null) {
            return null;
        }
        String b = b(a);
        if (r.a((CharSequence) b)) {
            return null;
        }
        return b;
    }

    public static Node a(Node node, String str, String str2, List<String> list) {
        List<Node> b;
        if (node == null || str == null || (b = b(node, str, str2, list)) == null || b.isEmpty()) {
            return null;
        }
        return b.get(0);
    }

    public static List<Node> b(Node node, String str, String str2, List<String> list) {
        if (node == null || str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName().equals(str) && a(item, str2, list)) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    private static boolean a(Node node, String str, List<String> list) {
        Node namedItem;
        if (str == null || list == null) {
            return true;
        }
        NamedNodeMap attributes = node.getAttributes();
        return (attributes == null || (namedItem = attributes.getNamedItem(str)) == null || !list.contains(namedItem.getNodeValue())) ? false : true;
    }
}
