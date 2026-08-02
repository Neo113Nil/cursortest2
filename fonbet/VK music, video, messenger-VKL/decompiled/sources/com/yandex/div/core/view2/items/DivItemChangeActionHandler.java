package com.yandex.div.core.view2.items;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.items.DivViewWithItemsController;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.json.expressions.ExpressionResolver;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;

/* compiled from: DivItemChangeActionHandler.kt */
/* loaded from: classes7.dex */
public final class DivItemChangeActionHandler {
    public static final DivItemChangeActionHandler INSTANCE = new DivItemChangeActionHandler();

    private DivItemChangeActionHandler() {
    }

    public static final boolean canHandle(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1789088446:
                return str.equals("set_next_item");
            case -1509135083:
                return str.equals("scroll_backward");
            case -1348467885:
                return str.equals("scroll_forward");
            case -1280379330:
                return str.equals("set_previous_item");
            case -770388272:
                return str.equals("scroll_to_start");
            case -88123690:
                return str.equals("set_current_item");
            case 633820873:
                return str.equals("scroll_to_end");
            case 1099321339:
                return str.equals("scroll_to_position");
            default:
                return false;
        }
    }

    private final Direction direction(String str) {
        return epx.f(str, "set_previous_item") ? Direction.PREVIOUS : epx.f(str, "set_next_item") ? Direction.NEXT : Direction.NEXT;
    }

    private final int getStepParam(Uri uri, int i) {
        String queryParameter = uri.getQueryParameter("step");
        if (queryParameter != null) {
            try {
                return Integer.parseInt(queryParameter);
            } catch (NumberFormatException unused) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail(queryParameter.concat(" is not a number"));
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int getStepParam$default(DivItemChangeActionHandler divItemChangeActionHandler, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return divItemChangeActionHandler.getStepParam(uri, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final boolean handleAction(Uri uri, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("id param is required to set item");
            }
            return false;
        }
        String authority = uri.getAuthority();
        DivViewWithItemsController.Companion companion = DivViewWithItemsController.Companion;
        DivItemChangeActionHandler divItemChangeActionHandler = INSTANCE;
        DivViewWithItemsController create = companion.create(queryParameter, divViewFacade, expressionResolver, divItemChangeActionHandler.direction(authority));
        if (create == null) {
            return false;
        }
        String queryParameter2 = uri.getQueryParameter("animated");
        boolean parseBoolean = queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : true;
        if (authority != null) {
            switch (authority.hashCode()) {
                case -1789088446:
                    if (authority.equals("set_next_item")) {
                        return divItemChangeActionHandler.handleNextItem(uri, parseBoolean, create);
                    }
                    break;
                case -1509135083:
                    if (authority.equals("scroll_backward")) {
                        return divItemChangeActionHandler.handleScrollBackward(uri, parseBoolean, create);
                    }
                    break;
                case -1348467885:
                    if (authority.equals("scroll_forward")) {
                        return divItemChangeActionHandler.handleScrollForward(uri, parseBoolean, create);
                    }
                    break;
                case -1280379330:
                    if (authority.equals("set_previous_item")) {
                        return divItemChangeActionHandler.handlePreviousItem(uri, parseBoolean, create);
                    }
                    break;
                case -770388272:
                    if (authority.equals("scroll_to_start")) {
                        return divItemChangeActionHandler.handleScrollToTheStart(parseBoolean, create);
                    }
                    break;
                case -88123690:
                    if (authority.equals("set_current_item")) {
                        return divItemChangeActionHandler.handleSetCurrentItem(uri, parseBoolean, create);
                    }
                    break;
                case 633820873:
                    if (authority.equals("scroll_to_end")) {
                        return divItemChangeActionHandler.handleScrollToTheEnd(parseBoolean, create);
                    }
                    break;
                case 1099321339:
                    if (authority.equals("scroll_to_position")) {
                        return divItemChangeActionHandler.handleScrollTo(uri, parseBoolean, create);
                    }
                    break;
            }
        }
        return false;
    }

    private final boolean handleNextItem(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z);
        return true;
    }

    private final boolean handlePreviousItem(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.changeCurrentItemByStep(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z);
        return true;
    }

    private final boolean handleScrollBackward(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), -getStepParam$default(this, uri, 0, 1, null), z);
        return true;
    }

    private final boolean handleScrollForward(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollByOffset(uri.getQueryParameter("overflow"), getStepParam$default(this, uri, 0, 1, null), z);
        return true;
    }

    private final boolean handleScrollTo(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollTo(getStepParam$default(this, uri, 0, 1, null), z);
        return true;
    }

    private final boolean handleScrollToTheEnd(boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToEnd(z);
        return true;
    }

    private final boolean handleScrollToTheStart(boolean z, DivViewWithItemsController divViewWithItemsController) {
        divViewWithItemsController.scrollToStart(z);
        return true;
    }

    private final boolean handleSetCurrentItem(Uri uri, boolean z, DivViewWithItemsController divViewWithItemsController) {
        String queryParameter = uri.getQueryParameter(DatabaseHelper.ITEM_COLUMN_NAME);
        if (queryParameter == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("item is required to set current item");
            }
            return false;
        }
        try {
            divViewWithItemsController.setCurrentItem(Integer.parseInt(queryParameter), z);
            return true;
        } catch (NumberFormatException unused) {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail(queryParameter.concat(" is not a number"));
            }
            return false;
        }
    }
}
