package com.yandex.div.core.resources;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import defpackage.jxi;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParserException;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00020\b2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u0001H\u0017¢\u0006\u0004\b\u0013\u0010\u0017J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u0001H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\u0014J\u0011\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u0001H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b(\u0010*J!\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000bH\u0017¢\u0006\u0004\b,\u0010-J/\u0010,\u001a\u0004\u0018\u00010'2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u0001H\u0016¢\u0006\u0004\b,\u0010.J\u0017\u0010/\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b/\u0010!J\u0017\u00101\u001a\u0002002\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u001f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b5\u00106J-\u0010;\u001a\u00020\u000b2\b\u00108\u001a\u0004\u0018\u0001072\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u000107H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020=2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b@\u0010\u0014J\u0017\u0010A\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bA\u0010\u000fJ\u0019\u0010C\u001a\u0004\u0018\u00010B2\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\bC\u0010DJ7\u0010H\u001a\u0002072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000b2\u0016\u0010G\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010F0\u0005\"\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bH\u0010IJ\u001f\u0010H\u001a\u0002072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bH\u0010JJ\u001f\u0010L\u001a\u00020K2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020\u000bH\u0016¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u0004\u0018\u0001072\u0006\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u0004\u0018\u0001072\u0006\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bQ\u0010PJ\u0019\u0010R\u001a\u0004\u0018\u0001072\u0006\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010PJ\u0019\u0010S\u001a\u0004\u0018\u0001072\u0006\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bS\u0010PJ/\u0010T\u001a\u0002072\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010G\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010F0\u0005\"\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010T\u001a\u0002072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bT\u0010PJ\u001f\u0010V\u001a\n\u0012\u0006\b\u0001\u0012\u0002070\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bV\u0010WJ#\u0010Y\u001a\u0004\u0018\u00010K2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010X\u001a\u0004\u0018\u00010KH\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010Y\u001a\u00020K2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bY\u0010[J\u001f\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00020K0\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\\\u0010]J+\u0010a\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u0001072\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\ba\u0010bJ)\u0010a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\ba\u0010cJ1\u0010d\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\b\u0010_\u001a\u0004\u0018\u00010^2\u0006\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bf\u0010\u000fJ%\u0010k\u001a\u0004\u0018\u00010j2\b\u0010h\u001a\u0004\u0018\u00010g2\b\u0010i\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020j2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bm\u0010nJ!\u0010q\u001a\u00020p2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010o\u001a\u0004\u0018\u00010^H\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010q\u001a\u00020p2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bq\u0010sJ\u0019\u0010u\u001a\u0004\u0018\u00010t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\bu\u0010vJ-\u0010z\u001a\u00020\b2\b\u0010w\u001a\u0004\u0018\u0001072\b\u0010i\u001a\u0004\u0018\u00010g2\b\u0010y\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0004\bz\u0010{J#\u0010}\u001a\u00020\b2\b\u0010|\u001a\u0004\u0018\u00010\r2\b\u0010y\u001a\u0004\u0018\u00010xH\u0016¢\u0006\u0004\b}\u0010~J'\u0010\u007f\u001a\u00020\b2\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005\"\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u007f\u0010\nJ(\u0010\u0082\u0001\u001a\u00020\b2\t\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u001c2\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010$H\u0017¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0002\u0010\u0084\u0001¨\u0006\u0085\u0001"}, d2 = {"Lcom/yandex/div/core/resources/ResourcesWrapper;", "Landroid/content/res/Resources;", "resources", "<init>", "(Landroid/content/res/Resources;)V", "", "Landroid/content/res/loader/ResourcesLoader;", "loaders", "Lzy11;", "addLoaders", "([Landroid/content/res/loader/ResourcesLoader;)V", "", "id", "Landroid/content/res/XmlResourceParser;", "getAnimation", "(I)Landroid/content/res/XmlResourceParser;", "", "getBoolean", "(I)Z", "getColor", "(I)I", "Landroid/content/res/Resources$Theme;", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "(ILandroid/content/res/Resources$Theme;)I", "Landroid/content/res/ColorStateList;", "getColorStateList", "(ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;", "(I)Landroid/content/res/ColorStateList;", "Landroid/content/res/Configuration;", "getConfiguration", "()Landroid/content/res/Configuration;", "", "getDimension", "(I)F", "getDimensionPixelOffset", "getDimensionPixelSize", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "(I)Landroid/graphics/drawable/Drawable;", "density", "getDrawableForDensity", "(II)Landroid/graphics/drawable/Drawable;", "(IILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;", "getFloat", "Landroid/graphics/Typeface;", "getFont", "(I)Landroid/graphics/Typeface;", "base", "pbase", "getFraction", "(III)F", "", "name", "defType", "defPackage", "getIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "", "getIntArray", "(I)[I", "getInteger", "getLayout", "Landroid/graphics/Movie;", "getMovie", "(I)Landroid/graphics/Movie;", "quantity", "", "formatArgs", "getQuantityString", "(II[Ljava/lang/Object;)Ljava/lang/String;", "(II)Ljava/lang/String;", "", "getQuantityText", "(II)Ljava/lang/CharSequence;", "resid", "getResourceEntryName", "(I)Ljava/lang/String;", "getResourceName", "getResourcePackageName", "getResourceTypeName", "getString", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "def", "getText", "(ILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "(I)Ljava/lang/CharSequence;", "getTextArray", "(I)[Ljava/lang/CharSequence;", "Landroid/util/TypedValue;", "outValue", "resolveRefs", "getValue", "(Ljava/lang/String;Landroid/util/TypedValue;Z)V", "(ILandroid/util/TypedValue;Z)V", "getValueForDensity", "(IILandroid/util/TypedValue;Z)V", "getXml", "Landroid/util/AttributeSet;", "set", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "obtainTypedArray", "(I)Landroid/content/res/TypedArray;", "value", "Ljava/io/InputStream;", "openRawResource", "(ILandroid/util/TypedValue;)Ljava/io/InputStream;", "(I)Ljava/io/InputStream;", "Landroid/content/res/AssetFileDescriptor;", "openRawResourceFd", "(I)Landroid/content/res/AssetFileDescriptor;", "tagName", "Landroid/os/Bundle;", "outBundle", "parseBundleExtra", "(Ljava/lang/String;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "parser", "parseBundleExtras", "(Landroid/content/res/XmlResourceParser;Landroid/os/Bundle;)V", "removeLoaders", ConfigConstants.CONFIG, "metrics", "updateConfiguration", "(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V", "Landroid/content/res/Resources;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ResourcesWrapper extends Resources {
    private final Resources resources;

    public ResourcesWrapper(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.resources = resources;
    }

    @Override // android.content.res.Resources
    public void addLoaders(ResourcesLoader... loaders) {
        this.resources.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int id) throws Resources.NotFoundException {
        return this.resources.getAnimation(id);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int id) throws Resources.NotFoundException {
        return this.resources.getBoolean(id);
    }

    @Override // android.content.res.Resources
    @jxi
    public int getColor(int id) throws Resources.NotFoundException {
        return this.resources.getColor(id);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int id, Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id, theme);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.resources.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int id) throws Resources.NotFoundException {
        return this.resources.getDimension(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int id) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelOffset(id);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int id) throws Resources.NotFoundException {
        return this.resources.getDimensionPixelSize(id);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.resources.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int id, Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getDrawable(id, theme);
    }

    @Override // android.content.res.Resources
    @jxi
    public Drawable getDrawableForDensity(int id, int density) throws Resources.NotFoundException {
        return this.resources.getDrawableForDensity(id, density);
    }

    @Override // android.content.res.Resources
    public float getFloat(int id) throws Resources.NotFoundException {
        return this.resources.getFloat(id);
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int id) throws Resources.NotFoundException {
        return this.resources.getFont(id);
    }

    @Override // android.content.res.Resources
    public float getFraction(int id, int base, int pbase) throws Resources.NotFoundException {
        return this.resources.getFraction(id, base, pbase);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String name, String defType, String defPackage) {
        return this.resources.getIdentifier(name, defType, defPackage);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int id) throws Resources.NotFoundException {
        return this.resources.getIntArray(id);
    }

    @Override // android.content.res.Resources
    public int getInteger(int id) throws Resources.NotFoundException {
        return this.resources.getInteger(id);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int id) throws Resources.NotFoundException {
        return this.resources.getLayout(id);
    }

    @Override // android.content.res.Resources
    @jxi
    public Movie getMovie(int id) throws Resources.NotFoundException {
        return this.resources.getMovie(id);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity, Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id, quantity, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int id, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityText(id, quantity);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceEntryName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourcePackageName(resid);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int resid) throws Resources.NotFoundException {
        return this.resources.getResourceTypeName(resid);
    }

    @Override // android.content.res.Resources
    public String getString(int id, Object... formatArgs) throws Resources.NotFoundException {
        return this.resources.getString(id, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int id) throws Resources.NotFoundException {
        return this.resources.getStringArray(id);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id, CharSequence def) {
        return this.resources.getText(id, def);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int id) throws Resources.NotFoundException {
        return this.resources.getTextArray(id);
    }

    @Override // android.content.res.Resources
    public void getValue(String name, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(name, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int id, int density, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValueForDensity(id, density, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int id) throws Resources.NotFoundException {
        return this.resources.getXml(id);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return this.resources.obtainAttributes(set, attrs);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int id) throws Resources.NotFoundException {
        return this.resources.obtainTypedArray(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id, TypedValue value) throws Resources.NotFoundException {
        return this.resources.openRawResource(id, value);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int id) throws Resources.NotFoundException {
        return this.resources.openRawResourceFd(id);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String tagName, AttributeSet attrs, Bundle outBundle) throws XmlPullParserException {
        this.resources.parseBundleExtra(tagName, attrs, outBundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser parser, Bundle outBundle) throws XmlPullParserException, IOException {
        this.resources.parseBundleExtras(parser, outBundle);
    }

    @Override // android.content.res.Resources
    public void removeLoaders(ResourcesLoader... loaders) {
        this.resources.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @jxi
    public void updateConfiguration(Configuration config, DisplayMetrics metrics) {
        super.updateConfiguration(config, metrics);
        Resources resources = this.resources;
        if (resources != null) {
            resources.updateConfiguration(config, metrics);
        }
    }

    @Override // android.content.res.Resources
    public void getValue(int id, TypedValue outValue, boolean resolveRefs) throws Resources.NotFoundException {
        this.resources.getValue(id, outValue, resolveRefs);
    }

    @Override // android.content.res.Resources
    public int getColor(int id, Resources.Theme theme) throws Resources.NotFoundException {
        return this.resources.getColor(id, theme);
    }

    @Override // android.content.res.Resources
    @jxi
    public ColorStateList getColorStateList(int id) throws Resources.NotFoundException {
        return this.resources.getColorStateList(id);
    }

    @Override // android.content.res.Resources
    @jxi
    public Drawable getDrawable(int id) throws Resources.NotFoundException {
        return this.resources.getDrawable(id);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int id, int density, Resources.Theme theme) {
        return this.resources.getDrawableForDensity(id, density, theme);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id) throws Resources.NotFoundException {
        return this.resources.getText(id);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int id) throws Resources.NotFoundException {
        return this.resources.openRawResource(id);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int id, int quantity) throws Resources.NotFoundException {
        return this.resources.getQuantityString(id, quantity);
    }

    @Override // android.content.res.Resources
    public String getString(int id) throws Resources.NotFoundException {
        return this.resources.getString(id);
    }
}
