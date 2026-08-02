package xsna;

import android.content.res.XmlResourceParser;
import java.io.InputStream;
import java.io.Reader;

/* compiled from: EnhancedVectorDrawableUtils.kt */
/* loaded from: classes6.dex */
public final class ky8 implements XmlResourceParser {
    public final XmlResourceParser b;

    public ky8(XmlResourceParser xmlResourceParser) {
        this.b = xmlResourceParser;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) {
        this.b.defineEntityReplacementText(str, str2);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return this.b.getAttributeBooleanValue(i, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        return this.b.getAttributeCount();
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        return this.b.getAttributeFloatValue(i, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        return this.b.getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return this.b.getAttributeListValue(i, strArr, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        return this.b.getAttributeName(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        return this.b.getAttributeNameResource(i);
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        return this.b.getAttributeNamespace(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        return this.b.getAttributePrefix(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        return this.b.getAttributeResourceValue(i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return this.b.getAttributeType(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return this.b.getAttributeUnsignedIntValue(i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        return this.b.getAttributeValue(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        return this.b.getClassAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return this.b.getColumnNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.b.getDepth();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.b.getEventType();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return this.b.getFeature(str);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        return this.b.getIdAttribute();
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        return this.b.getIdAttributeResourceValue(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return this.b.getInputEncoding();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.b.getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.b.getName();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        return this.b.getNamespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.b.getNamespaceCount(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return this.b.getNamespacePrefix(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return this.b.getNamespaceUri(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return this.b.getPositionDescription();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return this.b.getPrefix();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return this.b.getProperty(str);
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        return this.b.getStyleAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.b.getText();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        return this.b.getTextCharacters(iArr);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return this.b.isAttributeDefault(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return this.b.isEmptyElementTag();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return this.b.isWhitespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        return this.b.next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() {
        return this.b.nextTag();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() {
        return this.b.nextText();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return this.b.nextToken();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) {
        this.b.require(i, str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) {
        this.b.setFeature(str, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) {
        this.b.setInput(inputStream, str);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) {
        this.b.setProperty(str, obj);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        return this.b.getAttributeBooleanValue(str, str2, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        return this.b.getAttributeFloatValue(str, str2, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        return this.b.getAttributeIntValue(str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return this.b.getAttributeListValue(str, str2, strArr, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        return this.b.getAttributeResourceValue(str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        return this.b.getAttributeUnsignedIntValue(str, str2, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        return this.b.getAttributeValue(str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        return this.b.getNamespace(str);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) {
        this.b.setInput(reader);
    }
}
